https://leetcode.com/problems/invert-binary-tree/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        {
            return root;
        }
        TreeNode node = root;
         swapping(node);
         return root;
    }
    public void swapping(TreeNode node)
    {
        if(node == null || node.left == null && node.right == null)
        {
            return;
        }
        
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
        swapping(node.left);
        swapping(node.right);
    }
}
