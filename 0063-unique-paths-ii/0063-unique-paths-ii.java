class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp = new int[m][n];
dp[0][0] = 1;
         // Calculate remaining cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                 if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }

                // Skip starting cell because already initialized.
                if (i == 0 && j == 0) {
                    continue;
                }

                // From top
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                }

                // From left
                if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}