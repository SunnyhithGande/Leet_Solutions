class Solution
{
    public int absDifference(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int k1 = k;
        int sum1 = 0;
        int sum2 = 0;
        int i=0;
        int j=nums.length - 1;
        while(k>0)
        {
            sum1 = sum1 + nums[i++];
            k--;
        }
        while(k1>0)
        {
            sum2 = sum2 + nums[j--];
            k1--;
        }
        return Math.abs(sum2-sum1);
    }
}