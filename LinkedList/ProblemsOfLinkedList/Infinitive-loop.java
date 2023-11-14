https://leetcode.com/problems/happy-number/


class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }while(slow != fast);
        if(slow == 1)
        {
            return true;
        }
        return false;
    }

    private int findsquare(int number)
    {
        int ans=0;
        while(number > 0)
        {
            int rem =number%10;
            ans+= rem*rem;
            number/=10;

        }
        return ans;
    }
}


OUTPUT:
Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2              //it must be an infinitive loop and the sqaure answers will be repeated 
Output: false


  example n=12;

1^2 + 2^2 = 1+4 = 5
5^2             = 25
2^2 + 5^2 =4+25 = 29
2^2 + 9^2 =4+81 = 85
8^2 + 5^2 =64+25 = 89
8^2 + 9^2 = 64+81 = 145
1^2 + 4^2 + 5^2 = 1+16+25 = 42
4^2 + 2^2 = 16+4 = 20
2^2 + 0 = 4
4^2 = 16
1^2 + 6^2 = 1+36 = 37
3^2 + 7^2 = 9+49 = 58
5^2 + 8^2 = 25+64 = 89  // here starts the cyclic linkedlist
