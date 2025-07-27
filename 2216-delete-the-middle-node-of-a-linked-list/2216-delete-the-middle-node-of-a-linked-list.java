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
    public ListNode deleteMiddle(ListNode head) 
    {
        ListNode temp = head;
        int size = 0;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        if(size == 1) return null;
        temp = head;
        int cnt = 0;
        while(temp != null)
        {
            cnt++;
            if(cnt == size/2)
            {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}