class Solution 
{
    public int missingMultiple(int[] nums, int k) 
    {
        Set<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            if(x % k == 0) set.add(x);
        }
        for(int i=1;i<101;i++)
        {
            int num = k*i;
            if(!set.contains(num)) return num;
        }
        return 101;
    }
}