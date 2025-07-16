class Solution 
{
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        List<Integer> ls = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            hs1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            hs2.add(nums2[i]);
        }
        for(int i=0;i<nums3.length;i++)
        {
            hs3.add(nums3[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : hs1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : hs2)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : hs3)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>=2)
            {
                ls.add(entry.getKey());
            }
        }
        return ls;
    }
}