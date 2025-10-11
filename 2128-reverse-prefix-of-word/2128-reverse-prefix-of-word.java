class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        char arr[] = word.toCharArray();
        int r = 0;
        while(r<arr.length && arr[r] != ch)
        {
            r++;
        }
        if (r == arr.length) return word;
        int l = 0;
        while(l<r)
        {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}