class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
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