class Solution 
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int cnt = 0;
        int i = 0;
        int j = 0;
        while(i<fruits.length && j<baskets.length)
        {
            if(fruits[i] <= baskets[j])
            {
                baskets[j] = -1;
                i++;
                j=0;
            }
            else if(j == baskets.length - 1)
            {
                i++;
                j = 0;
            }
            else if(j<baskets.length) j++;
        }
        for(int k =0;k<baskets.length;k++)
        {
            if(baskets[k] != -1) cnt++;
        }
        return cnt;
    }
}