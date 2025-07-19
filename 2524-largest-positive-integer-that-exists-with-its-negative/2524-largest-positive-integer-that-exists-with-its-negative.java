class Solution 
{
    public int findMaxK(int[] nums) 
    {
        int n = nums.length;
        if(n == 1) return -1;
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }
        int max = -1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                int k = -nums[i];
                if(hs.contains(k))
                {
                    max = Math.max(max,k);
                }
            }
        }
        return max;
    }
}