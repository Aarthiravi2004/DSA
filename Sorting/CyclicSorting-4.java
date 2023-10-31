no: 442 
https://leetcode.com/problems/find-all-duplicates-in-an-array/


class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i < arr.length)
        {
            int correct = arr[i]-1;
            if(arr[correct] != arr[i])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index < arr.length;index++)
        {
            if(index+1 != arr[index])
            {
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
