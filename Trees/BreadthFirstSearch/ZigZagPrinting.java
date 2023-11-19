https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addFirst(root);
        boolean rev = false;
        while(!queue.isEmpty())
        {
            
            int levelsize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<levelsize;i++)
            {
                
                if(!rev)
                {
                    TreeNode current = queue.pollFirst();
                    currentLevel.add(current.val);
                    if(current.left != null)
                    {
                        queue.addLast(current.left);
                    }
                    if(current.right != null)
                    {
                        queue.addLast(current.right);
                    }
                    
                }
                else
                {
                    TreeNode current = queue.pollLast();
                    currentLevel.add(current.val);
                    
                    if(current.right != null)
                    {
                        queue.addFirst(current.right);
                    }
                    if(current.left != null)
                    {
                        queue.addFirst(current.left);
                    }
                    
                }

            }
            result.add(currentLevel);
            if(!rev)
            {
                rev=true;
            }
            else
            {
                rev = false;
            }
            
        }
        return result;
    }
}
