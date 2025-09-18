class Solution 
{
    public int alternateDigitSum(int n) 
    {
        int cnt = 0;
        int sum = 0;
        int v = n;
        while(v>0)
        {
            cnt++;
            v= v/10;
        }
        if(cnt%2!=0)
        {
            int x = 0;
            while(n > 0)
            {
                x = n % 10;
                sum = sum + (x);
                n = n/10;
                x = n % 10;
                sum = sum-(x);
                n = n/10;
            }
        }
        else
        {
            int x = 0;
            while(n > 0)
            {
                x = n % 10;
                sum = sum - (x);
                n = n/10;
                x = n % 10;
                sum = sum+(x);
                n = n/10;
            }
        }
        return sum;
    }
}