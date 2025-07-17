class Solution
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> vis = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third = -(nums[i]+nums[j]);
                if(vis.contains(third))
                {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    if(!hs.contains(temp))
                    {
                        hs.add(temp);
                        list.add(temp);
                    }
                }
                vis.add(nums[j]);
            }
        }
        return list;
    }
}