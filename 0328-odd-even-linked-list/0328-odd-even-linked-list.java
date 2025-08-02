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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode oddcurr = head;
        ListNode evenhead = head.next;
        ListNode evencurr = evenhead;
        while(oddcurr!=null && oddcurr.next!=null && oddcurr.next.next != null)
        {
            oddcurr.next = oddcurr.next.next;
            evencurr.next = evencurr.next.next;
            oddcurr = oddcurr.next;
            evencurr = evencurr.next;
        }
        oddcurr.next = evenhead;
        return head;
    }
}