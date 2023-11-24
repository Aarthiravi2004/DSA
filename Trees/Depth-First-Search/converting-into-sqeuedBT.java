https://leetcode.com/problems/flatten-binary-tree-to-linked-list/


class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    public void flatten(TreeNode root) {
        if(root == null || root.left == null && root.right == null)
        {
            return;
        }
        
        TreeNode node = root;
        copying(root);
        while(!queue.isEmpty())
        {
            node.right = queue.poll();
            node.left = null;
            node = node.right;
        }
        
    }
    public void copying(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        queue.offer(node);
        copying(node.left);
        copying(node.right);
    }
}


