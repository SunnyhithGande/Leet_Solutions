class Solution 
{
    public int[] evenOddBit(int n) 
    {
        int arr[] = new int[2];
        int evenCount = 0;
        int oddCount = 0;
        
        String bin = Integer.toBinaryString(n);
        int pos = 0; // bit position starting from rightmost bit
        
        for (int i = bin.length() - 1; i >= 0; i--) 
        {
            if (bin.charAt(i) == '1') 
            {
                if (pos % 2 == 0) evenCount++;
                else oddCount++;
            }
            pos++;
        }
        
        arr[0] = evenCount;  // even-position bits count
        arr[1] = oddCount;   // odd-position bits count
        return arr;
    }
}
