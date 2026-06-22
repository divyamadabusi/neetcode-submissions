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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0, head);
        ListNode nthFromEnd = dummy;
        ///int distBetweenNodes = 0;

        while(n > 1) {
            curr = curr.next;
            n--;
        }

        while(curr.next != null) {
            curr = curr.next;
            nthFromEnd = nthFromEnd.next;
        }

        nthFromEnd.next = nthFromEnd.next.next;
        return dummy.next;
        
    }
}
