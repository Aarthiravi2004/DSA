class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode last = head;
        ListNode tail = head;
        int length = 1;
        while(tail.next != null)
        {
            tail  = tail.next;
            length++;
        }
        int reverselength = length-k;
        while(k > 1)
        {
            first = first.next;
            k--;
        }
        while(reverselength > 0)
        {
             last = last.next;
             reverselength--;
        }

        int temp = first.val;
        first.val = last.val;
        last.val = temp;

        return head;
    }
}

OUTPUT:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
