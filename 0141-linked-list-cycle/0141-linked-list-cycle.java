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
    public boolean hasCycle(ListNode head) 
    {
        Set<ListNode> hs = new HashSet<>();
        ListNode mover = head;
        while(mover != null)
        {
            if(hs.contains(mover))
            {
                return true;
            }
            else
            {
                hs.add(mover);
            }
            mover = mover.next;
        }
        return false;
    }
}