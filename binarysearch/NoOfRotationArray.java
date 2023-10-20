Explanation:
rotated arr = [7,8,9,1,2,3,4,5,6]
original arr = [1,2,3,4,5,6,7,8,9]
   rotation 1 : [9,1,2,3,4,5,6,7,8]
   rotation 2 : [8,9,1,2,3,4,5,6,7]
   rotation 3 : [7,8,9,1,2,3,4,5,6]
  Answer : Pivot(2) +1 == 3;


Source Code:
class Solution{
  Public static void main(String[] args){
    int arr[7,8,9,1,2,3,4,5,6];
    int Count = searchPivot(arr);
    if(count == -1)
    {
      System.out.pritn("0");
    }
    else
    {
      System.out.print(Count);
    }
    
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
}
    
