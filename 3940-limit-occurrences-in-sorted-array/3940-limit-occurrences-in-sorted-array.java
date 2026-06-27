class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) 
        {
            int count = map.getOrDefault(num, 0);
            if (count < k) 
            {
                list.add(num);
            }
            map.put(num, count + 1);
        }
        int arr[] = new int[list.size()];
        int i=0;
        for(int x : list)
        {
            arr[i++] = x;
        }
        return arr;
    }
}