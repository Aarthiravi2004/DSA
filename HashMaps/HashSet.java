https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root,k,set);
        
        
    }
    public static boolean helper(TreeNode node,int k,HashSet<Integer> set)
    {
        if(node == null)
        {
            return false;
        }
        if(!set.isEmpty() && set.contains(k-node.val))
        {
            return true;
        }
        set.add(node.val);
        return helper(node.left,k,set)||helper(node.right,k,set);
    }
    
}
