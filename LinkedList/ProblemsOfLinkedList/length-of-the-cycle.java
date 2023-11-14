//finding the length of the cycle

public int hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length =0;
        while(fast != null && fast.next != null )
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                CaluculateTheLengthOfTheCycle(fast,slow);
            }
        }
        return -1;
    }
    
    public int CaluculateTheLengthOfTheCycle(ListNode fast, ListNode slow)
    {
        int length =1;
        slow = slow.next;
        do{
            length++;
        }while(fast == slow);
        
        return length;
    }
