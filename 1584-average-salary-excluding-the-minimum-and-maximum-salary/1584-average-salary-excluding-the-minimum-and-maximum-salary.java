class Solution 
{
    public double average(int[] salary) 
    {
        int n = salary.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max = Math.max(salary[i],max);
            min = Math.min(salary[i],min);
        }
        int sum = 0;
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(salary[i]!=max && salary[i]!=min)
            {
                sum = sum+salary[i];
                cnt++;
            }
        }
        return (double)sum/cnt;
    }
}