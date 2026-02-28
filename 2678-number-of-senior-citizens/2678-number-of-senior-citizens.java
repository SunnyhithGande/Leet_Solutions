class Solution 
{
    public int countSeniors(String[] details) 
    {
        int cnt = 0;
        for(int i=0;i<details.length;i++)
        {
            String res = details[i];
            if((res.charAt(11) - '0') >= 6 && (res.charAt(12) - '0') > 0) cnt++;
        }
        return cnt;
    }
}