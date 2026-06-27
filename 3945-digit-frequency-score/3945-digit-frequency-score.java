class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int x = n;
        int len = 0;
        while(x>0)
        {
            len++;
            x=x/10;
        }
        // int i=
        while(n > 0)
        {
            int ld = n % 10;
            if(!map.containsKey(ld)) map.put(ld,1);
            else map.put(ld,map.getOrDefault(ld,0)+1);
            n=n/10;
        }
        int s= 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int prod = entry.getKey() * entry.getValue();
            s= s+prod;
        }
        return s;
    }
}