class Solution 
{
    public String firstPalindrome(String[] words) 
    {
        boolean vis = true;
        for(int i=0;i<words.length;i++)
        {
            vis = true;
            String str = words[i];
            int l =0;
            int r = str.length()-1;
            while(l<r)
            {
                if(str.charAt(l) != str.charAt(r))
                {
                    vis = false;
                    break;
                }
                else
                {
                    l++;
                    r--;
                }
            }
            if(vis == true)
            return str;
        }
        return new String();
    }
}