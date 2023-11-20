https://leetcode.com/problems/binary-tree-right-side-view/


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list  = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            for(int i=0;i<levelsize;i++)
            {
                if( i== levelsize-1)
                {
                    list.add(queue.peek().val);
                }
                
            
                   TreeNode current = queue.poll();
                    if(current.left != null)
                    queue.offer(current.left);
                    if(current.right != null)
                    queue.offer(current.right);
            }
            

        }

        return list;
    }
}
