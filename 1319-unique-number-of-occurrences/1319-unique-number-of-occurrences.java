class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int freq : map.values())
        {
            if(hs.contains(freq))
            {
                return false;
            }
            else
            {
                hs.add(freq);
            }
        }
        return true;
    }
}