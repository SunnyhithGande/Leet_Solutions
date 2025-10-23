class Solution 
{
    public int mostFrequentEven(int[] nums) 
    {
        int freq[] = new int[100001];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] % 2 == 0)
            {
                freq[nums[i]]++;
            }
        }
        int max = -1;
        for(int i=0;i<freq.length;i=i+2) max = Math.max(max,freq[i]);
        if(max == 0) return -1;
        for(int i=0;i<freq.length;i=i+2)
        {
            if(freq[i] == max) return i;
        }
        return -1;
    }
}