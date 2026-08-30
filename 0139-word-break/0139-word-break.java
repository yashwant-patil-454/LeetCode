class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);
        int n = s.length();
        boolean dp[] = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String str = s.substring(j, i);
                if (dp[j] && set.contains(str)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}