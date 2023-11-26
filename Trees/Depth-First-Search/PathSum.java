https://leetcode.com/problems/path-sum/


class Solution {
    int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null)
        {
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null)
        {
            return true;
        }
        boolean left = hasPathSum(root.left,targetSum-root.val);
        boolean right = hasPathSum(root.right,targetSum-root.val);
        return left || right;
    }
}
