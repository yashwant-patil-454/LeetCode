class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }

        boolean[][] arr = new boolean[n][n];

        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < n; i++) {
            arr[i][i] = true;
        }

        for (int len = 2; len <= n; len++) {

            for (int left = 0; left + len <= n; left++) {
                int right = left + len - 1;
                if (s.charAt(left) == s.charAt(right)
                        && (len <= 2 || arr[left + 1][right - 1])) {
                    arr[left][right] = true;
                    if (len > maxLength) {
                        maxLength = len;
                        start = left;
                    }
                }
            }

        }
        return s.substring(start, start + maxLength);
    }
}