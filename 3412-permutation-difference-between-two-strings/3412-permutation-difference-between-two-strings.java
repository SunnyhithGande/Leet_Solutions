class Solution 
{
    public int findPermutationDifference(String s, String t) 
    {
        int sum = 0;
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map1.put(ch,i);
        }
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            map2.put(ch,i);
        }
        for(Map.Entry<Character,Integer> entry : map1.entrySet())
        {
            char ch = entry.getKey();
            int idx1 = entry.getValue();
            int idx2 = map2.get(ch);
            sum = sum + Math.abs(idx1-idx2);
        }
        return sum;
    }
}