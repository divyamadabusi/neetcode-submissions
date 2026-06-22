class Solution {
    public int minPathSum(int[][] grid) {
        //bottom up dp
        int[][] dp = new int[grid.length][grid[0].length];

        for(int r = grid.length - 1; r >= 0; r--) {
            for(int c = grid[0].length - 1; c >= 0; c--) {
                int right;
                int below;
                if(r != grid.length - 1 && c != grid[0].length - 1) {
                    right = dp[r + 1][c];
                    below = dp[r][c +1];
                    dp[r][c] = grid[r][c] + Math.min(right, below);
                } else if(c != grid[0].length - 1) {
                    below = dp[r][c +1];
                    dp[r][c] = grid[r][c] + below;
                } else if (r != grid.length - 1) {
                    right = dp[r + 1][c];
                    dp[r][c] = grid[r][c] + right;
                } else {
                    dp[r][c] = grid[r][c];
                }

            }
        }
        return dp[0][0];


    }
}