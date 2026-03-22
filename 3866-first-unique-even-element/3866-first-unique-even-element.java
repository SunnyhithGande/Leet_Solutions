class Solution {
    public int firstUniqueEven(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] % 2 == 0)
            {
                if(count(nums[i],nums) == 1) return nums[i];
            }
        }
        return -1;
    }
    public int count(int x,int[] arr)
    {
        int cnt = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                cnt++;
            }
        }
        return cnt;
    }
}