class Solution 
{
    public int minElement(int[] nums) 
    {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            int num = nums[i];
            while(num > 0)
            {
                int k = num % 10;
                sum = sum + k;
                num = num/10;
            }
            nums[i] = sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}