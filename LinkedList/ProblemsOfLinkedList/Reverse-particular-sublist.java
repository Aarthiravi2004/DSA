https://leetcode.com/problems/reverse-linked-list-ii/


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right)
        {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        for(int i=0;present != null && i < left-1; i++)
        {
            prev = present;
            present = present.next;
        }
        ListNode last = prev;
        ListNode newEnd = present;
        ListNode next = present.next;

        for(int i=0; present != null && i < right-left+1;i++)
        {
              present.next = prev;
              prev = present;
              present = next;
              if(next != null)
              {
                  next = next.next;
              }
        }

       if(last != null)
       {
           last.next = prev;
       }
       else
       {
           head = prev;
       }
       newEnd.next = present;

       return head;
    }
}

Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
