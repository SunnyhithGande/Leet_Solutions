class Solution 
{
    public int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
        int arr[] = new int[2];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int x : nums2) set1.add(x);
        for(int x : nums1) set2.add(x);
        int left = 0;
        int right = 0;
        for(int i=0;i<nums1.length;i++)
        {
            if(set1.contains(nums1[i])) left++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set2.contains(nums2[i])) right++;
        }
        arr[0] = left;
        arr[1] = right;
        return arr;         
    } 
}