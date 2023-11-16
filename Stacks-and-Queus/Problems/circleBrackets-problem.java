https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/


class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count =0;
        for(char ch : s.toCharArray())
        {
              if(ch == '(')
              {
                  stack.push(ch);
              }
              else if(ch == ')')
              {
                  if( stack.isEmpty() || stack.peek() != '(')
                  {
                      count++;
                  }
                  else
                  {
                      stack.pop();
                  }
              }
        }
        if(!stack.isEmpty())
        {
            count+=stack.size();
        }
        return count;
    }
}

OUTPTU:
input: (()
output: 1
 
