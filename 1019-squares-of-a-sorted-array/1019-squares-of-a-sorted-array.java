class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        if(n == 1)
        {
            nums[0] = nums[0]*nums[0];
            return nums;
        }
        int l = 0;
        int r = n-1;
        while(l<r)
        {
            nums[l] = nums[l]*nums[l];
            nums[r] = nums[r]*nums[r];
            l++;
            r--;
            if(l == r)
            {
                nums[l] = nums[l] * nums[l];
                break;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}