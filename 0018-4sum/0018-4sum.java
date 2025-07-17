class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int l = j+1;
                int r = n-1;
                while(l<r)
                {
                    long sum= 1L * nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target)
                    {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        hs.add(list);
                        l++;
                        r--;
                    }
                    else if(sum < target) l++;
                    else r--;
                }
            }
        }
        return new ArrayList<>(hs);
    }
}