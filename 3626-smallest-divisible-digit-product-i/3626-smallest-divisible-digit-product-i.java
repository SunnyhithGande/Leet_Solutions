class Solution 
{
    public int smallestNumber(int n, int t) 
    {
        int x = n;
        while(x>0)
        {
            int prod = 1;
            int temp = x;
            while (temp > 0)
            {
                prod = prod * (temp % 10);
                temp = temp / 10;
            }
            if(prod % t == 0)
            {
                return x;
            }
            else
            {
                x++;
            }
        }
        return 0;
    }
}