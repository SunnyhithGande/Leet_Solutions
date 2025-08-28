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
    public int pairSum(ListNode head) 
    {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        int max = 0;
        int sum = 0;
        int l = 0;
        int r = list.size() -1;
        while(l < r)
        {
            sum = list.get(l) + list.get(r);
            max = Math.max(sum,max);
            l++;
            r--;
        }
        return max;
    }
}