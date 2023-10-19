Ques :
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
  
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
  
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

  
Answer:

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] ={-1,-1};
        ans[0]=Search(nums,target,true);
        ans[1]=Search(nums,target,false);
        return ans;
    }
  
    public static int Search(int[] arr, int target,boolean first)
    {
        int n=arr.length;
        int ans=-1;
        int start=0;
        int end = (n-1);
        while(start<=end)
        {
            int mid=start+(end-start/2);
            if(target < arr[mid])
            {
                end=mid-1;
            }
            else if(target > arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(first)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

Output:
[5,7,7,8,8,10]
target = 8
Output
[3,4]
