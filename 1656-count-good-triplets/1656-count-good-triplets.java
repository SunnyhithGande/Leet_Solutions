class Solution 
{
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int cnt = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    int num1 = Math.abs(arr[i] - arr[j]);
                    int num2 = Math.abs(arr[j] - arr[k]);
                    int num3 = Math.abs(arr[i] - arr[k]);
                    if(num1 <=a && num2<=b && num3<=c) cnt++;
                }
            }
        }
        return cnt;
    }
}