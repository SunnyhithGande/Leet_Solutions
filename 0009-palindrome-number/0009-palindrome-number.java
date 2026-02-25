class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int n = x;
        int rn = 0;
        while(n>0)
        {
            int ld = n%10;
            rn = rn*10+ld;
            n = n/10;
            
        }
        if(rn == x)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
}