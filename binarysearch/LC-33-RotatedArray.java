Question:

There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
  
Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
  
Example 3:
Input: nums = [1], target = 0
Output: -1
 
Constraints:
1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104

Answer:
  
  class Solution {
    public int search(int[] nums, int target) {
        int pivot = searchPivot(nums);
        if(pivot == -1)
        {
            return normalBinarySearch(nums,target,0,(nums.length-1));
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target > nums[0]){
            return normalBinarySearch(nums,target,0,pivot-1);
        }
        if(target == nums[0])
        {
            return 0;
        }
        if(target == nums[nums.length-1])
        {
            return nums.length-1;
        }
            return normalBinarySearch(nums,target,pivot+1,(nums.length-1));
        
    }
     int searchPivot(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+ (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid] <= arr[start])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
           
        }
         return -1;
    }
    
     int normalBinarySearch(int[] arr,int target, int start, int end)
    {
        while(start <=end)
        {
            int mid = start + (end-start)/2;
            if(target > arr[mid])
            {
                start=mid+1;
            }
            else if(target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
              return mid;
            }
        }
       return-1;
    }
   
    
}


Explanation :
Pivot --> [5,6,7,8,2,3,4] // here 8 is the pivot element in this rotated array

  
Search for pivot cases:
case 1:
if( nums[mid] > nums[mid-1])--> Pivot =  mid
case 2:
if(nums[mid] < nums[mid-1]) --> Pivot = mid-1
case 3:
if(nums[mid] < nums[start]) --> end = mid-1;
case 4:
if(nums[mid] >  nums[start]) --> start = mid+1


Binary Search with Pivot element 
if pivot element is not found then the given array is not rotated
else
    case 1: pivot == target
    case 2: start > target --> 0 to pivot array
    case 3: start < target --> pivot to length array

  
