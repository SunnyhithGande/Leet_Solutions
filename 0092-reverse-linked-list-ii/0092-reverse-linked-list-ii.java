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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        int size = 0;
        while(curr != null)
        {
            size++;
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int i = left - 1;
        int j = right - 1;
        while(i < j)
        {
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        int idx = 0;
        while(curr != null)
        {
            curr.val = list.get(idx);
            curr = curr.next;
            idx++;
        }
        return head;
    }
}