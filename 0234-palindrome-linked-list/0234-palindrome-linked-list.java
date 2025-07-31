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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        ListNode prev = null;
        while (newHead != null) 
        {
            ListNode front = newHead.next;
            newHead.next = prev;
            prev = newHead;
            newHead = front;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null)
        {
            if(first.val != second.val)
            return false;
            else
            {
                first = first.next;
                second = second.next;
            }
        }
        return true;
    }
}