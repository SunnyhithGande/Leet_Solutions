class Solution 
{
    public boolean checkRecord(String s) 
    {
        if(s.contains("LLL")) return false;
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A')
            {
                cnt1++;
            }
            if(ch == 'L')
            {
                cnt2++;
            }
            if(ch == 'P')
            {
                cnt3++;
            }
        }
        if(cnt1<2) return true;
        return false;
    }
}