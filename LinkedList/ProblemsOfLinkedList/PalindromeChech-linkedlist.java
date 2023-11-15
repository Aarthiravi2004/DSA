https://leetcode.com/problems/palindrome-linked-list/

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }
        ListNode mid = FindMiddle(head);
        ListNode head2 = reversehalf(mid);
        ListNode firstPointer = head;
        ListNode secondPointer = head2;
        while(secondPointer != null)
        {
            if(firstPointer.val != secondPointer.val)
            {
                return false;
            }
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        
       return true;

        
    }
    public ListNode FindMiddle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            
            fast = fast.next.next;
            
        }
        return slow;
    }
    public ListNode reversehalf(ListNode head)
    {
        if(head == null)
        {
            return null;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        while(current != null)
        {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null)
            {
                next = next.next;
            }
        }
        return prev;
        
    }
}
                        //rereversing it  after the palindrome check will be usefull 

OUTPUT:
1 2 3 2 1
true
