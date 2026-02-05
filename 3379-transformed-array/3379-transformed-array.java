class Solution 
{
    public int[] constructTransformedArray(int[] nums) 
    {
        int res[] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                int k = nums[i];
                int newindex = (i + k) % n;
                res[i] = nums[newindex];
            }
            else if(nums[i] < 0)
            {
                int k = Math.abs(nums[i]) % n;
                int newindex = (i - k + n) % n;
                res[i] = nums[newindex];
            }
            else
            {
                res[i] = nums[i];
            }
        }
        return res;
    }
}