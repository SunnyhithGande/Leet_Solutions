class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int arr[] = new int[2];
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        arr[0] = ans;
        low = 0;
        high = nums.length - 1;
        ans = -1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        arr[1] = ans;
        return arr;
    }
}