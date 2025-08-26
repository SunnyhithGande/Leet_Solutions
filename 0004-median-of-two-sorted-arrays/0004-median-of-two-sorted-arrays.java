class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {      
        List<Integer> list = new ArrayList<>();
        for(int x : nums1)
        {
            list.add(x);
        } 
        for(int x : nums2)
        {
            list.add(x);
        } 
        Collections.sort(list);
        int n = list.size();
        if(n%2 == 1) return list.get(n/2);
        else return (list.get(n/2 - 1) + list.get(n/2)) / 2.0;
    }
}