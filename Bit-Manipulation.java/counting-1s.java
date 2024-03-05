public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        if(n<0)
        {
            int j=32;
            while(j>0)
            {
                int k = n&1;
                if(k==1)
                {
                    count++;
                }
                n = n>>1;
                j--;
            }
            return count;
        }
        while(n>0)
        {
            int k = n&1;
            if(k==1)
            {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
