https://leetcode.com/problems/populating-next-right-pointers-in-each-node/


class Solution {
    public Node connect(Node root) {
        if(root == null)
        {
            return root;
        }
        Node node = new Node();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize = queue.size();
            for(int i=0;i<levelsize;i++)
            {
                node = queue.poll();
                if(i == levelsize-1)
                {
                    
                    node.next = null;
                }
                else
                {
                    if(queue.peek() != null)
                    node.next = queue.peek();
                }
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right!= null)
                {
                    queue.offer(node.right);
                }

            }

        }
        return root;
        
    }
}
