class Solution 
{
    public int maxProduct(int n) 
    {
        int x = n;
        int cnt = 0;
        while(x>0)
        {
            cnt++;
            x = x/10;
        }
        x = n;
        int dummy[] = new int[cnt];
        int i = 0;
        while(x>0)
        {
            int k = x % 10;
            dummy[i++] = k;
            x = x/10;
        }
        Arrays.sort(dummy);
        return dummy[dummy.length-1] * dummy[dummy.length-2]; 
    }
}