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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode curr = head;
        while(curr != null && curr.next != null)
        {
            int min = Math.min(curr.val,curr.next.val);
            int gcd = 0;
            for(int i=1;i<=min;i++)
            {
                if(curr.val % i == 0 && curr.next.val % i == 0)
                {
                    gcd = Math.max(gcd,i);
                }
            }
            ListNode newNode = new ListNode(gcd);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        return head;
    }
}