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
        if(head.next == null) {
            head = null;
            return head;
        }
        ListNode curr = head;
        ListNode nthPrev = head;
        int count = 0;

        while(curr.next != null) {
            curr = curr.next;
            count++;
        }

        int desired = count - n + 1;
        System.out.println(desired);
        if(desired == 0) {
            return head.next;
        }
        

        while(desired > 1) {
            desired--;
            nthPrev = nthPrev.next;
        }
        nthPrev.next = nthPrev.next.next;
        return head;
        

        // 0 1 2 3 4 5 curr- n
        
    }
}
