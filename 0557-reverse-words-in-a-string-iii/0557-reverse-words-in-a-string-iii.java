class Solution 
{
    public String reverseWords(String s) 
    {
        char arr[] = s.toCharArray();
        int l = 0;
        int n = arr.length;
        while(l<n)
        {
            int r = l;
            while(r<n && arr[r] != ' ')
            {
                r++;
            }
            int left = l;
            int right = r-1;
            while (left < right) 
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            l = r+1;
        }
        return new String(arr);
    }
}