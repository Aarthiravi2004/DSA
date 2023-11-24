https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        {
            return root;
        }
       return LCA(root,p,q);
    }
    public TreeNode LCA(TreeNode node,TreeNode p, TreeNode q)
    {
        if(node == null)
        {
            return null;
        }
        if(node == p || node==q)
        {
            return node;
        }
        TreeNode left = LCA(node.left,p,q);
        TreeNode right = LCA(node.right,p,q);

        if(right!=null && left != null)
        {
            return node;
        }
        else if(left == null)
        {
            return right;
        }
        return left;
    }
}
