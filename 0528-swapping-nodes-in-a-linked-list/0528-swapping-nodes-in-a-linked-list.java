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
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode curr = head;
        int n = k-1;
        int cnt = 0;
        while(curr != null)
        {
            cnt++;
            curr = curr.next;
        }
        curr = head;
        while(curr != null && n!=0)
        {
            curr = curr.next;
            n--;
        }
        ListNode curr1 = head;
        int size = cnt-k;
        while(curr1 != null && size != 0)
        {
            curr1 = curr1.next;
            size--;
        }
        int temp = curr.val;
        curr.val = curr1.val;
        curr1.val = temp;
        return head;
    }
}