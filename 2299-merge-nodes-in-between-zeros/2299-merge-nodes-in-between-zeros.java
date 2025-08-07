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
class Solution 
{
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode curr = head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(curr != null && curr.next != null)
        {
            int sum = 0;
            if(curr.val == 0) curr = curr.next;
            while(curr.val != 0)
            {
                sum = sum + curr.val;
                curr = curr.next;
            }
            curr.val = sum;
            prev.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}