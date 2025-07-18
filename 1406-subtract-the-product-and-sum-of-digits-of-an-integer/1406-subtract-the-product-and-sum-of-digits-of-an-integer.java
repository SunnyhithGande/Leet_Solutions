class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        int x = n;
        int sum = 0;
        int prod = 1;
        int k=0;
        while(x>0)
        {
            k = x%10;
            sum = sum+k;
            prod = prod*k;
            x=x/10;
        }
        return prod-sum;
    }
}