class Solution 
{
    public int countSeniors(String[] details) 
    {
        int cnt = 0;
        for(int i=0;i<details.length;i++)
        {
            String str = details[i];
            String res = str.substring(11, str.length() - 2);
            int num = 0;
            for(int k=0;k<res.length();k++)
            {
                num = num*10 + (res.charAt(k) - '0');
            }
            if(num > 60) cnt++;
        }
        return cnt;
    }
}