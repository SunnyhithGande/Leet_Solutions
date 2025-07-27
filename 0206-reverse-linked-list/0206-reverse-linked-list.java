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
    public ListNode reverseList(ListNode head) 
    {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp = temp.next;
        }
        if(list.size() == 0) return null;
        ListNode newhead = new ListNode(list.get(list.size()-1));
        ListNode mover = newhead;
        for(int i=list.size()-2;i>=0;i--)
        {
            ListNode x = new ListNode(list.get(i));
            mover.next = x;
            mover = x;
        }
        return newhead;
    }
}