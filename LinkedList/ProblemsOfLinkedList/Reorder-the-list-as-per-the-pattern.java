https://leetcode.com/problems/reorder-list/


class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        {
            return;
        }
        ListNode mid = Findmiddle(head);
        ListNode secondhalf = reverseList(mid);
        ListNode first = head;
        ListNode second = secondhalf;
        while(second != null && first != null)
        {
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
        
        if(first != null)
        {
            first.next = null;
        }
    }
    public ListNode Findmiddle(ListNode head) {
        ListNode halfSpeed = head;
        ListNode fullSpeed = head;
        while( fullSpeed != null && fullSpeed.next != null )
        {
            fullSpeed = fullSpeed.next.next;
            halfSpeed = halfSpeed.next;
        }
        return halfSpeed;
    }
     public ListNode reverseList(ListNode head) {
        if( head == null || head.next == null)
        {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null)
            {
                next = next.next;
            }
        }
        return prev;
    }
}


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
