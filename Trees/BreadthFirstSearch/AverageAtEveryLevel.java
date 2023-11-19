https://leetcode.com/problems/average-of-levels-in-binary-tree/


class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            double average=0;
            int levelsize = queue.size();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode current = queue.poll();
                 average+=(current.val);
                 if(current.left != null)
                 {
                     queue.offer(current.left);
                 }
                 if(current.right != null)
                 {
                     queue.offer(current.right);
                 }
            }
            average/=levelsize;
            result.add(average);
            
        }
        return result;
        
    }
