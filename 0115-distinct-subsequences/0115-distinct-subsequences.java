class Solution {
    public int numDistinct(String s, String t) {

        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];

        // There is exactly one way to form an empty string:
        // choose no characters from s.
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // dp[0][j] remains 0 for j > 0 because
        // a non-empty t cannot be formed from an empty s.

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                // If current characters match,
                // we have two choices:
                // 1. Use s[i - 1] -> dp[i - 1][j - 1]
                // 2. Skip s[i - 1] -> dp[i - 1][j]
                if (s.charAt(i - 1) == t.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1]
                            + dp[i - 1][j];

                } else {

                    // Characters don't match,so we must skip s[i - 1].
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}