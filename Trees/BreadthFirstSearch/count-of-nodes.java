https://leetcode.com/problems/count-complete-tree-nodes/

class Solution {
    int count=0;
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!(queue.isEmpty()))
        {
            count++;
            TreeNode temp = queue.poll();
            if(temp != null && temp.left != null)
            {
                queue.add(temp.left);

            }
            if(temp != null && temp.right != null)
            {
                queue.add(temp.right);
            }
        }
        return count;
    }
}


Input:
1,2,3,4,5,6
OUPUT:
6
