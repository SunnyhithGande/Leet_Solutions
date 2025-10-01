class Solution 
{
    public int[] numberOfPairs(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();
        for(int x : nums)
        {
            list.add(x);
        }
        int l = 0;
        int r = l+1;
        int cnt = 0;
        while(l < list.size() - 1)
        {
            r = l+1;
            while (r < list.size() && !list.get(l).equals(list.get(r))) 
            {
                r++;
            }
            if(r < list.size())
            {
                cnt++;
                list.remove(r);
                list.remove(l);
                l=0;
                r=l+1;
            }
            else
            {
                l++;
            }
        }
        int arr[] = new int[2];
        arr[0] = cnt;
        arr[1] = list.size();
        return arr;
    }
}