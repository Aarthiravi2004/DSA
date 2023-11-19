https://leetcode.com/problems/binary-tree-level-order-traversal/


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            List<Integer> currentList = new ArrayList<>();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currentNode = queue.poll();
               currentList.add(currentNode.val);
               if(currentNode.left != null)
               {
                   queue.offer(currentNode.left);
               }
               if(currentNode.right != null)
               {
                   queue.offer(currentNode.right);
               }
            }
            result.add(currentList);
        }
          return result;
        
    }
}

