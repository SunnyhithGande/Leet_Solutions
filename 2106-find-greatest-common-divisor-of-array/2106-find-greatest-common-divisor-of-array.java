class Solution 
{
    public int findGCD(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int supermax = 0;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        for(int i=1;i<=max;i++)
        {
            if(max%i == 0 && min%i==0)
            {
                supermax = Math.max(supermax,i);
            }
        }
        return supermax;
    }
}