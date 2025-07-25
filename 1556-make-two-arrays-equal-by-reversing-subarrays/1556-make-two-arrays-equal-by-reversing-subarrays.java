class Solution 
{
    public boolean canBeEqual(int[] target, int[] arr) 
    {
        Arrays.sort(target);
        Arrays.sort(arr);
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == target[i])
            {
                cnt++;
            }
        }
        if(cnt == n) return true;
        return false;
    }
}