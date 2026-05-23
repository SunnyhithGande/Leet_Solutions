class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        // compare i th and i+1 th element
        // also dont forget to compare the laast and first elememnt!
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1])
            cnt++;
        }
        // dont forgte to check the o th and n-1 th indexes
        if(nums[0]>=nums[n-1])
        cnt++;
        if(cnt>=n-1)
        return true;
        return false;
    }
}