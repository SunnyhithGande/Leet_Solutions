class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : nums)
        {
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        int freq[] = new int[max+1];
        for(int x : nums)
        {
            freq[x]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min;i<max;i++)
        {
            if(freq[i] == 0) list.add(i);
        }
        return list;
    }
}