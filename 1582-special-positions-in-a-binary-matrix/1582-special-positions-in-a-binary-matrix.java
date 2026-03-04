class Solution 
{
    public int numSpecial(int[][] mat) 
    {
        int r = mat.length;
        int c = mat[0].length;
        int cnt = 0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j] == 1 && check(mat,i,j))
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public boolean check(int mat[][],int row,int col)
    {
        int r = mat.length;
        int c = mat[0].length;
        for(int i=0;i<r;i++)
        {
            if(i != row && mat[i][col] == 1)
            {
                return false;
            }
        }
        for(int j=0;j<c;j++)
        {
            if(j!=col && mat[row][j] == 1)
            {
                return false;
            }
        }
        return true;
    }
}