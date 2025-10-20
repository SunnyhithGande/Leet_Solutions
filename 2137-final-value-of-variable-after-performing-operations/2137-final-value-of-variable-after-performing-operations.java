class Solution 
{
    public int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;
        for(String v : operations)
        {
            if(v.contains("+"))
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}