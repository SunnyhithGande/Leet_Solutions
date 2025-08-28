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
    public void reorderList(ListNode head) 
    {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int l = 0;
        int r = list.size() - 1;
        List<Integer> newl = new ArrayList<>();
        while(l <= r)
        {
            newl.add(list.get(l));
            newl.add(list.get(r));
            l++;
            r--;
        }
        int i = 0;
        while(curr != null)
        {
            curr.val = newl.get(i);
            i++;
            curr = curr.next;
        }
    }
}