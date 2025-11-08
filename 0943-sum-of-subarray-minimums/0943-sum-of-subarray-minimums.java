class Solution 
{
    public int sumSubarrayMins(int[] arr) 
    {
        final long MOD = 1_000_000_007L;
        int n = arr.length;
        int nse[] = findNSE(arr);
        int pse[] = findPSE(arr);
        long total = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            long left = i - pse[i];   
            long right = nse[i] - i; 
            long contrib = ((left * right) % MOD * arr[i]) % MOD;
            total = (total + contrib) % MOD;
        }
        return (int)total;
    }
    public int[] findNSE(int[] arr)
    {
        int n = arr.length;
        int[] nse = new int[n];
        Arrays.fill(nse, n); 
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++)
        {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                nse[st.pop()] = i;
            }
            st.push(i);
        }
        return nse;
    }
    public int[] findPSE(int[] arr) 
    {
        int n = arr.length;
        int[] pse = new int[n];
        Arrays.fill(pse, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) 
        {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) 
            {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pse;
    }
}