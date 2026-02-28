class Solution 
{
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) 
    {
        int freq[] = new int[101];
        for(int bulb : bulbs)
        {
            freq[bulb]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] % 2 != 0)
            {
                list.add(i);
            }
        }
        return list;
    }
}