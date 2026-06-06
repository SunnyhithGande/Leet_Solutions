class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0;
        int rs = 0;
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
                arr1[i] = ls;
                ls = ls + nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
                arr2[i] = rs;
                rs = rs + nums[i];
        }
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i] = Math.abs(arr1[i] - arr2[i]);
        }
        return res;
    }
}