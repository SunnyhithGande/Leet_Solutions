class Solution 
{
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int cnt = 0;
            for(int j=i;j<n;j++)
            {
                cnt++;
                if(cnt%2 != 0)
                {
                    int k = i;
                    while(k<=j)
                    {
                        sum = sum+arr[k];
                        k++;
                    }
                }
            }
        }
        return sum;
    }
}