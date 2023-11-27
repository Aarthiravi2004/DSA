https://leetcode.com/problems/same-tree/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
        {
            if(p==null && q==null){
            return true;
            }
            return false;
        }
        if(p.val != q.val)
        {
            return false;
        }
        boolean left =  isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);
        return left && right ;
        

        
    }
}
