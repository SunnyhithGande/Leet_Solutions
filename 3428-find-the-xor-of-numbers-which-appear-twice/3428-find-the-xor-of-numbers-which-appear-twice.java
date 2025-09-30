class Solution 
{
    public int duplicateNumbersXOR(int[] nums) 
    {
        int xor = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2)
            {
                xor = xor^entry.getKey();
            }
        }
        return xor;
    }
}