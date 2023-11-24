https://leetcode.com/problems/kth-smallest-element-in-a-bst/

class Solution {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return checking(root,k).val;
        
    }
    public TreeNode checking(TreeNode node,int k)
    {
        if(node == null)
        {
            return null;
        }
        TreeNode left = checking(node.left,k);
        if(left != null)
        {
            return left;
        }
        count++;
        if(count == k)
        {
            return node;
        }

        
        return checking(node.right,k);

    }
}
