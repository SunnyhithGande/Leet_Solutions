class Solution 
{
    public int countSeniors(String[] details) 
    {
        int cnt = 0;
        for(int i=0;i<details.length;i++)
        {
            String res = details[i];
            int tens = res.charAt(11) - '0';
            int ones = res.charAt(12) - '0';
            if(tens > 6 || (tens == 6 && ones > 0)) cnt++;
        }
        return cnt;
    }
}