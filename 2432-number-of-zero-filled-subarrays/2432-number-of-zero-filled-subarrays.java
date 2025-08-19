class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        int k = 0;
        long cnt = 0;
        while(k<nums.length)
        {
            if(nums[k] == 0)
            {
                cnt++;
            }
            k++;
        }
        int l = 0;
        for(int r=l+1;r<nums.length;r++)
        {
            if(nums[l] == 0 && nums[r] == 0)
            {
                int extra = 1;
                while(r<nums.length && nums[r]==0)
                {
                    cnt = cnt+extra;
                    extra++;
                    r++;
                }
                l=r;
            }
            else
            {
                l++;
            }
        }
        return cnt;
    }
}