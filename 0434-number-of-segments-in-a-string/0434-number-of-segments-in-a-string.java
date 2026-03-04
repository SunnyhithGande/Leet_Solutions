class Solution 
{
    public int countSegments(String s) 
    {
        int cnt = 0;
        char arr[] = s.toCharArray();
        int l=0;
        while(l < arr.length)
        {
            while(l < arr.length && arr[l] == ' ')
            {
                l++;
            }
            if(l < arr.length) cnt++;
            while(l < arr.length&& arr[l] != ' ')
            {
                l++;
            }
        }
        return cnt;
    }
}