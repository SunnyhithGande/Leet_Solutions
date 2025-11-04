class Solution 
{
    public int countOdds(int low, int high) 
    {
        // int cnt = 0;
        // while(low <= high)
        // {
        //     if(low % 2!=0)
        //     {
        //         cnt++;
        //         low++;
        //     }
        //     low++;
        // }
        // return cnt;
        int count = (high - low) / 2;
        if (low % 2 != 0 || high % 2 != 0) 
        {
            count++;
        }
        return count;
    }
}