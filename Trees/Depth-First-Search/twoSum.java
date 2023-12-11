https://leetcode.com/problems/two-sum-iv-input-is-a-bst/


class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        return helper(root,k,list);
        
        
    }
    public static boolean helper(TreeNode node,int k,List<Integer> list)
    {
        if(node == null)
        {
            return false;
        }
        if(!list.isEmpty() && list.contains(k-node.val))
        {
            return true;
        }
        list.add(node.val);
        boolean left = helper(node.left,k,list);
        boolean right = helper(node.right,k,list);

        return right||left;
    }
    
}
