class Solution 
{
    public int maximum69Number (int num) 
    {
        int size = 0;
        int num1 = num;
        while(num > 0)
        {
            size++;
            int k = num%10;
            num = num/10;
        }
        int arr[] = new int[size];
        int n = arr.length;
        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i] = num1%10;
            num1 = num1/10;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] != 9)
            {
                arr[i] = 9;
                break;
            }
        }
        int num2 = 0;
        for (int d : arr) 
        {
            num2 = num2 * 10 + d;
        }
        return num2;
    }
}