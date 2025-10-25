class Solution 
{
    public int getLeastFrequentDigit(int n) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        int x = n;
        while (x > 0)
        {
            int k = x % 10;
            map.put(k, map.getOrDefault(k, 0) + 1);
            x = x / 10;
        }
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() < min)
            {
                min = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}