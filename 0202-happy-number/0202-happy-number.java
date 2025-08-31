class Solution 
{
    public boolean isHappy(int n) 
    {
        if(n == 1) return true;
        int x = n;
        int sum = 0;
        while(x != 1 && x != 4)
        {
            sum = 0;
            while(x>0)
            {
                int k = x%10;
                int pow = (int)Math.pow(k,2);
                x = x/10;
                sum = sum + pow;
            }
            x = sum;
            if(sum == 1) return true;
        }
        return false;
    }
}