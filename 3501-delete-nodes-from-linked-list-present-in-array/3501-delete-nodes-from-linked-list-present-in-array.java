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
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        ListNode dummy = new ListNode(-1,head);
        ListNode prev = dummy;
        ListNode curr = head;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        while(curr != null)
        {
            while (curr != null) 
            {
                if (hs.contains(curr.val)) 
                {
                    prev.next = curr.next;
                } 
                else 
                {
                    prev = curr;
                }
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}