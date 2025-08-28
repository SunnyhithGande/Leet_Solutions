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
    public ListNode removeZeroSumSublists(ListNode head) 
    {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        for(int i=0;i<list.size();i++)
        {
            int sum = 0;
            for(int j=i;j<list.size();j++)
            {
                sum = sum + list.get(j);
                if(sum == 0)
                {
                    for (int k = j; k >= i; k--)
                    {
                        list.remove(k);
                    }
                    i=-1;
                    break;
                }
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for(int x : list)
        {
            ListNode newN = new ListNode(x);
            p.next = newN;
            p = newN;
        }
        return dummy.next;
    }
}