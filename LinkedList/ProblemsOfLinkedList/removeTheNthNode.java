class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode tail = head;
       ListNode temp = head;
       int length=1;
       while(tail.next != null)
       {
           tail = tail.next;
           length++;
       }
       if(length == 1)
       {
           return null;
       }
       length = length-n;
       if(length == 0)
       {
           return head.next;
       }
       while(length > 1)
       {
           temp = temp.next;
           length--;
       }
       
       temp.next = temp.next.next;
       
       return head;

    }
}

OUTPUT:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
