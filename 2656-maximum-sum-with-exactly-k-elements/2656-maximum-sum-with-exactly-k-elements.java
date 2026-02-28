class Solution 
{
    public int maximizeSum(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=nums.length-1;i>=0;)
        {
            sum = sum+nums[i];
            nums[i] = nums[i] + 1;
            k--;
            if(k==0) break;
        }
        return sum;
    }
}