https://leetcode.com/problems/rotate-list/



class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode temp1 = head;
        int length=0;
        while(temp1 != null)
        {
            temp1 = temp1.next;
            length++;
        }
        k = k%length;
        while(k>0)
        {
            ListNode temp = head;
            ListNode tail = null;
            while(temp != null && temp.next != null)
            {
                if(temp.next.next == null)
                {
                    tail = temp;
                }
                temp = temp.next;
            }
            temp.next = head;
            head = temp;
            tail.next = null;
            k--;
        }
        return head;
    }
}


OUTPUT:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
