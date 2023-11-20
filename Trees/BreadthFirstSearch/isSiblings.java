https://leetcode.com/problems/cousins-in-binary-tree/


class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val == x || root.val == y || root == null)
        {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            
            int levelsize = queue.size();
            boolean x1 = false;
            boolean y1 = false;
            for(int i=0;i<levelsize;i++)
            {
                TreeNode current = queue.poll();
                if(current.left != null && current.right != null)
                {
                    if(current.left.val == x && current.right.val == y || current.left.val == y && current.right.val ==x)
                    {
                        return false;
                    }
                }
                if(current.left != null)
                {
                    queue.offer(current.left);
                    if(current.left.val == x)
                    {
                        x1 = true;
                    }
                    else if(current.left.val == y)
                    {
                        y1 = true;
                    }
                }
                if(current.right != null)
                {
                    queue.offer(current.right);
                    if(current.right.val == x)
                    {
                        x1 = true;
                    }
                    else if(current.right.val == y)
                    {
                        y1 = true;
                    }
                }
                
            }
            if(x1 && y1)
            {
                return true;
            }
        }
        return false;
        }
        
    }
