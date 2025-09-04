class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int cnt1 = Math.abs(x-z);
        int cnt2 = Math.abs(y-z);
        if(cnt1 == cnt2) return 0;
        if(cnt1 < cnt2) return 1;
        return 2;
    }
}