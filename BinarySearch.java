import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class First {
    public static int binarysearch(int[] arr, int x)
    {
        int l=0;
        int r=(arr.length-1);
        while(l<r)
        {
            int mid=(l+r)/2;  // also you can do as mid=(l+(r-l)/2 to het the mid answer into the range of int
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(x < arr[mid])
            {
                r = mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {25,67,89,34,10,23,12};
        int x=92;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print(binarysearch(arr,x));

    }
 }


Leetcode question : 
    
   1. You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].


Answer:
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        int mid;
        while(start<= end)
        {
            mid = start+(end-start)/2;
            if(target <  letters[mid])
            {
                end = mid -1;
            }
            else
            {
                start = mid +1;
            }
            
            
        }
        return letters[start % letters.length];   //it is used to erap around ex:next elemnt of z --> a
        
    }
}
