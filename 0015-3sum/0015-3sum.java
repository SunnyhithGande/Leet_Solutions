class Solution
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int l=i+1;
            int r = n-1;
            while(l<r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    hs.add(list);
                    l++;
                    r--;
                }
                else if(sum<0) l++;
                else r--;
            }
        }
        return new ArrayList<>(hs);
    }
}