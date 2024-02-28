https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
        {
            return null;
        }
        return recursion(nums,0,nums.length-1);
    }
    public static TreeNode recursion(int nums[],int i,int j)
    {
        if(i>j)
        {
            return null;
        }
        int mid = i+(j-i)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = recursion(nums,i,mid-1);
        node.right = recursion(nums,mid+1,j);
        return node;
    }
}
