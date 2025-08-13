class Solution 
{
    public int smallestIndex(int[] nums) 
    {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = 0;
            int num = nums[i];
            while(num > 0)
            {
                int k = num % 10;
                sum = sum + k;
                num = num/10;
            }
            if(sum == i) return i;
        }
        return -1;
    }
}