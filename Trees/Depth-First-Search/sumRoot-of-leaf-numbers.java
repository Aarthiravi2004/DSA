https://leetcode.com/problems/sum-root-to-leaf-numbers/



class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
        
        
    }
    public int helper(TreeNode node, int sum)
    {
        if(node == null)
        {
            return 0;
        }
        sum = sum*10+node.val;
        if(node.left == null && node.right == null)
        {
            return sum;
        }
        int left = helper(node.left,sum);
        int right = helper(node.right,sum);
        return left+right;
    }
}
