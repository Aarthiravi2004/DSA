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
            // this part will get change in the duplicate elements cases
          if(arr[mid] == arr[start] && arr[mid]== arr[end])
          {
                //skip the duplictes 
               // check for the pivot element
            if(arr[start] > arr[start+1])
            {
              return start;
            }
            start++;
            if(arr[end] < arr[end-1])
            {
              return end;
            }
            end-;
          }
          else if(arr[start] > arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end]))
          {
            start = mid+1;
          }
          else
          {
            end = mid-1;
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
