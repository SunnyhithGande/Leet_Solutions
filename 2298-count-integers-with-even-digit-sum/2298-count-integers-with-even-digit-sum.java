class Solution {
    public int countEven(int num) {
        int cnt = 0;
        int sum = 0;
        for(int i=1;i<=num;i++)
        {
            sum = 0;
            int n = i;
            while(n > 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }
            if(sum % 2 == 0) cnt++;
        }
        return cnt;
    }
}