class Solution 
{
    public int maximizeExpressionOfThree(int[] nums) 
    {
        Arrays.sort(nums);
        int i= nums.length-1;
        int j=nums.length-2;
        int k=0;
        return (nums[i] + nums[j] - nums[k]);
    }
}