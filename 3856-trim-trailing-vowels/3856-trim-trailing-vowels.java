class Solution 
{
    public String trimTrailingVowels(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i=sb.length()-1;i>=0;i--)
        {
            if(isVowel(sb.charAt(i))) sb.deleteCharAt(i);
            else break;
        }
        return sb.toString();
    }
    public boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}