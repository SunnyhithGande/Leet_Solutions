class Solution 
{
    public String reverseByType(String s) 
    {
        char[] arr = s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l < r)
        {
            if(!Character.isLetter(arr[l]))
            l++;
            else if(!Character.isLetter(arr[r]))
            r--;
            else
            {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        int le=0;
        int ri = arr.length-1;
        while(le < ri)
        {
            if(Character.isLetter(arr[le]))
            le++;
            else if(Character.isLetter(arr[ri]))
            ri--;
            else
            {
                char temp = arr[le];
                arr[le] = arr[ri];
                arr[ri] = temp;
                le++;
                ri--;
            }
        }
        return new String(arr);
    }
}