https://leetcode.com/problems/validate-binary-search-tree/


class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        {
            return false;
        }
        return checking(root,null,null);
        
    }
    public boolean checking(TreeNode node,Integer low,Integer high)
    {
        if(node == null)
        {
            return true;
        }
        if(low != null && node.val <= low)
        {
            return false;
        }
        if(high != null && node.val >= high)
        {
            return false;
        }
        boolean left = checking(node.left,low,node.val);
        boolean right = checking(node.right,node.val,high);
        return left && right;
    }
}
