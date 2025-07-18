class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int n = nums.length;
        int l=0;
        int r=n-1;
        int dummy[] = new int[]{-1,-1};
        while(l<=r)
        {
            if(nums[l] == target && dummy[0]==-1)
            {
                dummy[0] = l;
            }
            if(nums[r] == target && dummy[1] == -1)
            {
                dummy[1] = r;
            }
            if(dummy[0] != -1 && dummy[1]!=-1) break;
            if(nums[l] != target) l++;
            if(nums[r] != target) r--;
        }
        return dummy;
    }
}