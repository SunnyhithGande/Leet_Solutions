class Solution 
{
    public int bitwiseComplement(int n) 
    {
        if(n == 0) return 1;
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
            sb.append(n % 2);
            n = n/2;
        }
        sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i) == '1') sb.setCharAt(i, '0');
            else sb.setCharAt(i, '1');;
        }
        int res = 0;
        for(int i=0;i<sb.length();i++)
        {
            res = res * 2 + (sb.charAt(i) - '0');
        }
        return res;
    }
}