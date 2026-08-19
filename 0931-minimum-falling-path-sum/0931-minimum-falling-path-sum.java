class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int length = matrix.length;
        int dp[][] = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[0][i] = matrix[0][i];
        }

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int previousMin = dp[i - 1][j];
                if (j > 0) {
                    previousMin = Math.min(previousMin, dp[i - 1][j - 1]);
                }
                if (j < length - 1) {
                    previousMin = Math.min(previousMin, dp[i - 1][j + 1]);
                }
                dp[i][j] = matrix[i][j] + previousMin;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < length; j++) {
            result = Math.min(result, dp[length - 1][j]);
        }
        return result;
    }
}