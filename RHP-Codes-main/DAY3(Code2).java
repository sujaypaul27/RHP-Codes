//LC(329. Longest Increasing Path in a Matrix)
class Solution {
    final int diff[][]={{-1,0},{1,0},{0,1},{0,-1}};
    private int dfs(int[][] matrics,int[][]dp,int R,int C, int row,int col)
    {
        if(dp[row][col]!=0)
        {
            return dp[row][col];//coz alredy calculated and stored
        }
        int adjmax=0;
        for(int i=0;i<4;i++)
        {
            int nr=row+diff[i][0];
            int nc=col+diff[i][1];
            if(nr>=0 && nr<R && nc>=0 && nc <C)
            {
                if(matrics[nr][nc]>matrics[row][col])
                {
                    adjmax=Math.max(adjmax,dfs(matrics,dp,R,C,nr,nc));
                }
            }
        }
        dp[row][col]=1+adjmax;
        return 1+adjmax;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int maxlength=1;
        int[][] dp=new int [R][C];
        for(int row=0;row<R;row++)
        {
            for(int col=0;col<C;col++)
            {
                if(dp[row][col]==0)
                {
                    maxlength=Math.max(maxlength,dfs(matrix,dp,R,C,row,col));
                }
            }
        }
        return maxlength;
    }
}