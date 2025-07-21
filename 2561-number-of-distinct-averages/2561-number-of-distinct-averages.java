class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        HashSet<Double> hs = new HashSet<>();
        while(l<r)
        {
            hs.add((nums[l]+nums[r])/2.0);
            l++;
            r--;
        }
        return hs.size();
    }
}