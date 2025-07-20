class Solution 
{
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            int k = arr[i];
            for(int j=i+1;j<n;j++)
            {
                k += arr[j];
                if((j-i+1)%2!=0)
                sum += k;
            }
        }
        return sum;
    }
}