https://leetcode.com/problems/count-complete-tree-nodes/


class Solution {
   
    public int countNodes(TreeNode root) {
        return root == null ? 0 : 1 + countNodes(root.left)+countNodes(root.right);
        
    }
}

Input:
1 2 3 4 5 6
Output:
6
