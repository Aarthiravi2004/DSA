Qns: Search the target element in a infinitive array without using length function

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,0,7,8,6,5,4,3};
        int target;
        target = sc.nextInt();
        int temp;
        int start =0;
        int end = 1;
        while(target > arr[end])
        {
            temp= end+1;
            end = end + (end-start + 1) *2;
            start = temp;
        }
        System.out.print(search(arr,temp,target,end));
        
    }
    public static int search(int[] arr, int start, int target, int end)
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
        return -1;
    }
}
