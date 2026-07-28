class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.MAX_VALUE;
            if (i >= 1) {
                arr[i] = Math.min(arr[i], arr[i - 1] + costs[i - 1] + 1);
            }

            if (i >= 2) {
                arr[i] = Math.min(arr[i], arr[i - 2] + costs[i - 1] + 4);
            }

            if (i >= 3) {
                arr[i] = Math.min(arr[i], arr[i - 3] + costs[i - 1] + 9);
            }
        }
        return arr[n];
    }
}