https://leetcode.com/problems/linked-list-cycle-ii/


public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length == 0)
        {
            return null;
        }
        ListNode firstPointer = head;
        ListNode secondPointer = head;

        while(length > 0)
        {
            secondPointer =secondPointer.next;
            length--;
        }

        while(firstPointer != secondPointer)
        {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;

        }
        return secondPointer;
        
    }

    public static int lengthOfCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                ListNode temp = slow;
                int length = 0;
                do{
                    length++;
                    temp = temp.next;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}


OUTPUT:
