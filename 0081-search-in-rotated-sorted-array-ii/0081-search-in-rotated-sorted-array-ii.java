class Solution {
    public boolean search(int[] nums, int target) 
    {
        // this is O(N)
        //next i will do with O(logn) binary search...
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target) return true;
        }   
        return false;
    }
}