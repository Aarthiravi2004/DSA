https://leetcode.com/problems/binary-tree-inorder-traversal/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         inorder(root,list);
        return list;
        
    }
    public void inorder(TreeNode node, List<Integer> list)
    {
        if(node == null)
        {
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}
