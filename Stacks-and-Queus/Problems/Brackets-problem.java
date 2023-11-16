https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/



class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == '(')
            {
                stack.push(ch[i]);
            }
            else{
                if(i+1 < ch.length && ch[i+1] == ')')
                {
                     
                        i++;
                }
                    else
                    {
                        count++;
                    }
                    
                
                    if(!stack.isEmpty())
                    {
                        stack.pop();
                    }
                    else
                    {
                        count++;
                    }
                }
        }
        count+=2*stack.size();
        return count;
    }
}

