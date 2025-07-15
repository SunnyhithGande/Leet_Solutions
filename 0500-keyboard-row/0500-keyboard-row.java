class Solution 
{
    public String[] findWords(String[] words) 
    {
        int n = words.length;
        String fr = "qwertyuiop";
        String sr = "asdfghjkl";
        String tr = "zxcvbnm";
        String[] s = new String[n];
        int idx = 0;
        for(int i=0;i<n;i++)
        {
            int cnt = 0,cnt2= 0,cnt1=0;
            for(int j=0;j<words[i].length();j++)
            {
                char ch = Character.toLowerCase(words[i].charAt(j));
                if(fr.contains(String.valueOf(ch))) cnt++;
                else if(sr.contains(String.valueOf(ch))) cnt1++;
                else if(tr.contains(String.valueOf(ch))) cnt2++;
            }
            if(cnt == words[i].length() || cnt1==words[i].length() || cnt2 == words[i].length()) s[idx++] = words[i];
        }
        String temp[] = new String[idx];
        for(int i=0;i<idx;i++)
        {
            temp[i] = s[i];
        }
        return temp;
    }
}