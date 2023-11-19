https://leetcode.com/problems/binary-tree-level-order-traversal-ii/


class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> currentList = new ArrayList<>();
            int levelsize = queue.size();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode current = queue.poll();
                currentList.add(current.val);
                if(current.left != null)
                {
                    queue.offer(current.left);
                }
                if(current.right != null)
                {
                    queue.offer(current.right);
                }
            }
            result.add(currentList);

        }
        Collections.reverse(result);
        return result;
    }
}
