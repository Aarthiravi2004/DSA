class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=0;
            k=(int)Math.log10(nums[i])+1; //to find the number of digits in the decimal format ex:log2(nums[i]) --> it will return the digits in the binary format
            if(k%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
