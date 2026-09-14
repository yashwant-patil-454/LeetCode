class Solution {
    public int tribonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        // dp[i] stores the Tribonacci number at index i.
        int[] dp = new int[n + 1];

        // Initialize the first three Tribonacci numbers.
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        // Calculate the remaining Tribonacci numbers.
        for (int i = 3; i <= n; i++) {

            // Current value = sum of the previous three values.
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // Return the n-th Tribonacci number.
        return dp[n];
    }
}