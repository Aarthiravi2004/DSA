https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int depth = Math.max(left,right)+1;
        return depth;
    }
}


// this question is as same as the height of the binary tree
