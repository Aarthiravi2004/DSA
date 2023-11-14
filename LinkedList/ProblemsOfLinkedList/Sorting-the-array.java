/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

      //Bubblesorting but time limit exceeded

      
        // ListNode upperLoop = head;
        // if(head == null || head.next == null)
        // {
        //     return head;
        // }
        // while(upperLoop != null)
        // {
        //     ListNode lowerLoop = head;
        //     while(lowerLoop != null)
        //     {
        //         if(lowerLoop.val > upperLoop.val)
        //         {
        //             int temp = lowerLoop.val;
        //             lowerLoop.val = upperLoop.val;
        //             upperLoop.val = temp;
        //         }
        //         lowerLoop = lowerLoop.next;
        //     }
        //     upperLoop = upperLoop.next;
        // }
        // return head;


      //end of bubblesort
      

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        while(temp != null)
        {
            temp.val = list.get(count++);
            temp = temp.next;
        }
        return head;
    }
}

OUTPUT:
input: 5 4 3 2 1
  1 2 3 4 5
