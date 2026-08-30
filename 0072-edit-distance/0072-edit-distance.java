class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] cost = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 1; i <= m; i++) {
            cost[i][0] = i;
        }

        for (int i = 1; i <= n; i++) {
            cost[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    cost[i][j] = cost[i - 1][j - 1];

                } else {
                    int leftTop = cost[i - 1][j - 1];
                    int top = cost[i - 1][j];
                    int left = cost[i][j - 1];
                    cost[i][j] = Math.min(leftTop, Math.min(top, left)) + 1;

                }
            }

        }
        return cost[m][n];
    }
}