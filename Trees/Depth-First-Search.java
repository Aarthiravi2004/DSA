https://leetcode.com/problems/diameter-of-binary-tree/


class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        height(root);
        return diameter-1;
        
    }
    int height(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
         int leftheight = height(node.left);
         int rightheight = height(node.right);

         int dia = leftheight + rightheight+1;
         diameter = Math.max(diameter,dia);
         return Math.max(leftheight,rightheight)+1;
    }
}
