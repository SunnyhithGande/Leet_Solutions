class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        int n = nums.length;
        int dummy[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int idx = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2)
            {
                dummy[idx++] = entry.getKey();
            }
        }
        return dummy;
    }
}