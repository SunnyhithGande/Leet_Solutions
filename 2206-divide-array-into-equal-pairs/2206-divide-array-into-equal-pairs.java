class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        int freq[] = new int[501];
        for(int x : nums)
        {
            freq[x]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] % 2!=0) return false;
        }
        return true;
    }
}