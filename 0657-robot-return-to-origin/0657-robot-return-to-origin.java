class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        for(int i=0;i<moves.length();i++)
        {
            char ch = moves.charAt(i);
            if(ch == 'R') cnt1++;
            else if(ch == 'L') cnt2++;
            else if(ch == 'U') cnt3++;
            else cnt4++;
        }
        if(cnt1 != cnt2 || cnt3 != cnt4) return false;
        return true;
    }
}