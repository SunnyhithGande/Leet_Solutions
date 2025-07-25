class Solution
{
    public int maxSum(int[] nums) 
    {
        int n = nums.length;
        if(n == 1) return nums[0];
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(nums[i]))
            {
                hs.add(nums[i]);
                if(nums[i] > 0)
                {
                    sum = sum +nums[i];
                }
            }
        }
        if(sum == 0) return nums[n-1];
        return sum;
    }
}