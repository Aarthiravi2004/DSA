https://leetcode.com/problems/binary-tree-maximum-path-sum/

class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
        
    }
    public int helper(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);                       // check for the negative values;

        int PathSum =left+right+node.val;

        ans = Math.max(ans,PathSum);

        return Math.max(left,right)+node.val;
    }
}
