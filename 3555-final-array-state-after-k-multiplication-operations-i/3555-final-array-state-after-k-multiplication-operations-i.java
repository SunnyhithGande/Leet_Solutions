class Solution 
{
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        int l = 0;
        while(k>0)
        {
            int min = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i] < min)
                {
                    min = nums[i];
                    l = i;
                }
            }
            nums[l] = nums[l] * multiplier;
            k--;
        }
        return nums;
    }
}