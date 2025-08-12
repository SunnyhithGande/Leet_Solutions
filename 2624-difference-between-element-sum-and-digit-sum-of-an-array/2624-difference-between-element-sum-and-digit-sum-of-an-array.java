class Solution 
{
    public int differenceOfSum(int[] nums) 
    {
        int sum = 0;
        int sum1 = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            int num = nums[i];
            while(num > 0)
            {
                int k = num % 10;
                sum1 = sum1 + k;
                num = num/10;
            }
        }
        return Math.abs(sum-sum1);
    }
}