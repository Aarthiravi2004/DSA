https://leetcode.com/problems/populating-next-right-pointers-in-each-node/


class Solution {
    public Node connect(Node root) {
        if(root == null)
        {
            return root;
        }
        check(root);
        
        return root;
        
    }
       public static void check(Node node){
           if(node.left == null || node.right == null)
           {
               return;
           }
            node.left.next = node.right;
            if(node.next != null)
            {
                node.right.next = node.next.left;
            }
            check(node.left);
            check(node.right);
        }
}
