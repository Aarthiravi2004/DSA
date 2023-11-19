public static TreeNode NextSuccessor(TreeNode root, int target)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root ==  null)
        {
            return null;
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            TreeNode current = queue.poll();
                
                if(current.left != null)
                {
                    queue.offer(current.left);
                }
                if(current.right != null)
                {
                    queue.offer(current.right);
                }
                if(current.val == target)
                {
                    return (queue.peek());
                }
            }
        
        return queue.peek();
    }

OUTPUT:
              1
        2           3
    4      5    6       7
  8      9         10      11


  target: 5 
  result : 6

  target : 7
  result: 8
