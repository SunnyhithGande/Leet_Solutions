class Solution 
{
    public int percentageLetter(String s, char letter) 
    {
        int cnt = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == letter) cnt++;
        }
        return (int)(cnt * 100.0)/s.length();
    }
}