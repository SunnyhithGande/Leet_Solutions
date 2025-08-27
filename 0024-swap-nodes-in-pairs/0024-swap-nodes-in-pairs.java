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
    public ListNode swapPairs(ListNode head) 
    {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        for(int i=0;i<list.size()-1;i=i+2)
        {
            int temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);
        }
        int i=0;
        while(i<list.size())
        {
            curr.val = list.get(i);
            curr = curr.next;
            i++;
        }
        return head;
    }
}