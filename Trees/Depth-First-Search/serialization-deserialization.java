public class Codec {

    // Encodes a tree to a single string.
    public List<String> serialize(TreeNode root) {
        List<String> string = new ArrayList<>();
         helper1(root,string);
         return string;
        
    }
    public void helper1(TreeNode node,List<String> string)
    {
        if(node == null)
        {
            string.add("null");
            return;
        }
        string.add(String.ValueOf((node.val)));
        helper1(node.left,string); 
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> string) {
        Collections.reverse(string);
        TreeNode node = helper2(string);
        return node;

        
    }
    public TreeNode helper2(List<String> string)
    {
        String val = string.remove(string.size()-1);
        if(val.charAt(0)=='n')
        {
            return null;
        }
        TreeNode node = new TreeNode(Integer.ParseInt(val));
        node.left(helper2(string));
        node.right(helper2(string));
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
