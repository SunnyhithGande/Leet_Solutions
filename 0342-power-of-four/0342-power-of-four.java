class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        long power = 1;
        while(power <= n)
        {
            if(power == n) return true;
            power = power * 4;
        }
        return false;
    }
}