https://leetcode.com/problems/swap-nodes-in-pairs/

class Solution {
    public ListNode swapPairs(ListNode head) {
        return swapping(head);
    
        
    }
    public ListNode swapping(ListNode node)
    {
        if(node == null || node.next == null)
        {
            return node;
        }
        ListNode temp = node.next.next;
        node.next.next = node;
        ListNode temp2 = node.next;
        node.next = swapping(temp);
        return temp2;
    }
}
