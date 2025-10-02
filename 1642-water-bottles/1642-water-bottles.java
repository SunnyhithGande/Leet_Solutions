class Solution 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int total = numBottles;
        while(numBottles >= numExchange)
        {
            int f = numBottles / numExchange;
            int l = numBottles % numExchange;
            total = total + f;
            numBottles = f+l;
        }
        return total;
    }
}