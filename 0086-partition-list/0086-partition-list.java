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
    public ListNode partition(ListNode head, int x) 
    {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        List<Integer> list1 = new ArrayList<>();
        for(int i : list)
        {
            if(i<x) list1.add(i);
        }
        for(int i : list)
        {
            if(i>=x) list1.add(i);
        }
        int i=0;
        while(curr != null)
        {
            curr.val = list1.get(i);
            curr = curr.next;
            i++;
        }
        return head;
    }
}