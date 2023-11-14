class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode halfSpeed = head;
        ListNode fullSpeed = head;
        if(halfSpeed.next == null)
        {
            return null;
        }
        while( fullSpeed != null && fullSpeed.next.next != null && fullSpeed.next.next.next != null)
        {
            fullSpeed = fullSpeed.next.next;
            halfSpeed = halfSpeed.next;
        }
        halfSpeed.next = halfSpeed.next.next;
        return head;
        
    }
}

OUTPUT:
input: 1 2 3 4 5 6
Output: 1 2 3 5 6
