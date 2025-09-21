class Solution 
{
    public int countDistinctIntegers(int[] nums) 
    {
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int n = nums[i];
            hs.add(reverse(n));
            hs.add(n);
        }
        return hs.size();
    }
    public static int reverse(int n)
    {
        int rno = 0;
            while(n > 0)
            {
                int k= n % 10;
                rno = rno * 10 + k;
                n = n/10;
            }
            return rno;
    }
}