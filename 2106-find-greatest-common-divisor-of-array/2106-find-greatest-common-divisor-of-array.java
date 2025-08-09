class Solution 
{
    public int findGCD(int[] nums) 
    {
        int max = 0;
        Arrays.sort(nums);
        int l = nums[0];
        int r = nums[nums.length - 1];
        for(int i=1;i<=r;i++)
        {
            if(l%i == 0 && r%i==0)
            {
                max = Math.max(max,i);
            }
        }
        return max;
    }
}