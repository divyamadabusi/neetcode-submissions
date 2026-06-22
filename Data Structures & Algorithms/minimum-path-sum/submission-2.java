class Solution {
    private int[][] dp;

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return dfs(0,0, grid);
        
    }

    private int dfs(int r, int c, int[][] grid) {
        

        int sum;
        if(r == grid.length - 1 && c == grid[0].length - 1) {

            dp[r][c] = grid[r][c];
            return dp[r][c];
        }
        if(dp[r][c] != -1) {
            return dp[r][c];
        }

        if(r == grid.length - 1) {

            sum = grid[r][c] + dfs(r, c+1, grid);
            
        } else if (c == grid[0].length - 1) {
            sum = grid[r][c] + dfs(r + 1, c , grid);
        } else {
            sum = grid[r][c] + Math.min(dfs(r + 1, c , grid), dfs(r, c+1, grid));
        }
        dp[r][c] = sum;
        return sum;
    }
}