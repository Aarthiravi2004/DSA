no: 287 
https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
    while(i < arr.length){
        int correct = arr[i]-1;
        if(i != correct && arr[correct] != arr[i])
        {
            swap(arr,i,correct);
        }
        else 
        {
            i++;
        }
    }
    for(int j=0;j<arr.length;j++)
    {
        if(j != arr[j]-1)
        {
            return arr[j];
        }
    }
    return -1;
}
 static void swap(int[] arr, int first, int second)
{
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
}
   
