class Solution 
{
    public int maximizeSum(int[] nums, int k) 
    {
        int max = 0;
        int sum = 0;
        for(int n : nums)
        {
            max = Math.max(n,max);
        }
        while(k-- != 0)
        {
            sum = sum + max;
            max++;
        }
        return sum;
    }
}