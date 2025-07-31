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
    public ListNode oddEvenList(ListNode head) 
    {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        if (head == null || head.next == null) return head;
        while(temp != null)
        {
            list.add(temp.val);
            if(temp.next != null) temp = temp.next.next;
            else temp = null;
        }
        temp = head.next;
        while(temp != null)
        {
            list.add(temp.val);
            if(temp.next != null) temp = temp.next.next;
            else temp = null;
        }
        temp = head;
        int i = 0;
        while(temp != null)
        {
            temp.val = list.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }
}