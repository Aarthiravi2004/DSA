class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode halfSpeed = head;
        ListNode fullSpeed = head;
        while( fullSpeed != null && fullSpeed.next != null )
        {
            fullSpeed = fullSpeed.next.next;
            halfSpeed = halfSpeed.next;
        }
        return halfSpeed;
    }
}

OUTPUT:
input: 1 2 3 4 5
Output: 3

input: 1 2 3 4 5 6
output: 4
