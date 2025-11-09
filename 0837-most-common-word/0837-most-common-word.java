class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        Map<String,Integer> map = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        for (String w : words) 
        {
            if (bannedSet.contains(w)) continue;
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        String ans = "";
        int max = 0;
        for (Map.Entry<String,Integer> e : map.entrySet()) 
        {
            if (e.getValue() > max) 
            {
                max = e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }
}