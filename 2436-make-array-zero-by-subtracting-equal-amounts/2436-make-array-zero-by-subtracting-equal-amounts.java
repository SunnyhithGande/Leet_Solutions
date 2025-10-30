class Solution 
{
    public int minimumOperations(int[] nums) 
    {
        int cnt = 0;
        Set<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            if(!set.contains(x) && x != 0)
            {
                cnt++;
                set.add(x);
            }
            else
            {
                cnt--;
            }
        }
        return set.size();
    }
}