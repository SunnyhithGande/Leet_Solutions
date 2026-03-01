class Solution 
{
    public int minMoves(int[] nums) 
    {
        int max = 0;
        for(int x : nums)
        max = Math.max(x,max);
        int cnt1 = 0;
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            if(num < max)
            {
                while(num < max)
                {
                    cnt1++;
                    num++;
                }
            }
        }
        return cnt1;
    }
}