class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            list.add(generateRow(i));
        }
        return list;
    }
    private List<Integer> generateRow(int row)
    {
        List<Integer> cr = new ArrayList<>();
        long ans = 1;
        cr.add(1);
        for(int col = 1;col<=row;col++)
        {
            ans = ans * (row-col+1);
            ans = ans/(col);
            cr.add((int)ans);
        }
        return cr;
    }
}