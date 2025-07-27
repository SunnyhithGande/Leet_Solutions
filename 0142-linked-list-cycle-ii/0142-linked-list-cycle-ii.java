/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        Set<ListNode> hs = new HashSet<>();
        ListNode temp = head;
        while(temp!=null)
        {
            if(hs.contains(temp))
            {
                return temp;
            }
            else
            {
                hs.add(temp);
            }
            temp = temp.next;
        }
        return temp;
    }
}