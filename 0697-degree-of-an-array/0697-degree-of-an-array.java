class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new HashMap<>();
        int min =Integer.MAX_VALUE;
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(!first.containsKey(nums[i])) first.put(nums[i],i);
            last.put(nums[i],i);
            max = Math.max(max,map.get(nums[i]));
        }
        for(int key : map.keySet())
        {
            if(map.get(key) == max)
            {
                int length = last.get(key)-first.get(key)+1;
                min = Math.min(length,min);
            }
        }
        return min;
    }
}