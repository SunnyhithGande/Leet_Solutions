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
    public int[] nextLargerNodes(ListNode head) 
    {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j) > list.get(i))
                {
                    res[i] = list.get(j);
                    break;
                }
            }
        }
        return res;
    }
}