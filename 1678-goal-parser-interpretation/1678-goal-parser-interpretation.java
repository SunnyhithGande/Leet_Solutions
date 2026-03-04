class Solution 
{
    public String interpret(String command) 
    {
        StringBuilder sb = new StringBuilder();
        int i=0;
        char arr[] = command.toCharArray();
        while(i < arr.length)
        {
            if(arr[i] == 'G')
            {
                sb.append('G');
                i++;
            }
            else if(arr[i] == '(' && arr[i+1] == ')')
            {
                sb.append('o');
                i=i+2;
            }
            else
            {
                sb.append("al");
                i=i+4;
            }
        }
        return sb.toString();
    }
}