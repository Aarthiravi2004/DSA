no:268 
https://leetcode.com/problems/missing-number/


class Solution {
    public int missingNumber(int[] arr) {
    int i=0;
    int n=arr.length;
    while(i < arr.length){
        
        if(i != arr[i])
        {
            if(arr[i] >= arr.length)
            {
                i++;
            }
            else
            {
               swap(arr,i,arr[i]);
            }
        }
        else 
        {
            i++;
        }
    }
    for(int j=0;j<arr.length;j++)
    {
        if(arr[j]!=j)
        {
            return j;
        }
        
    }
    return n;
}
 static void swap(int[] arr, int first, int second)
{
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
}
    
