class Solution 
{
    public int mirrorDistance(int n) 
    {
        int x = n;
        int rno = 0;
        while(x>0)
        {
            int ld = x % 10;
            rno = rno * 10 + ld;
            x = x/10;
        }
        return Math.abs(n - rno);
    }
}