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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        for(int i=0;i+k<=list.size();i=i+k)
        {
            int l = i;
            int r = i+k-1;
            while(l < r)
            {
                int temp = list.get(l);
                list.set(l,list.get(r));
                list.set(r,temp);
                l++;
                r--;
            }
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