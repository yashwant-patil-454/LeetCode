class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[][] arr = new int[n + 1][m + 1];

        int maxLength = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                // If current elements are equal,
                // extend the previous common subarray
                if (nums1[i - 1] == nums2[j - 1]) {

                    arr[i][j] = arr[i - 1][j - 1] + 1;

                    // Keep track of maximum length
                    maxLength = Math.max(maxLength, arr[i][j]);
                }

                // If elements don't match,
                // arr[i][j] remains 0.
            }
        }

        return maxLength;
    }
}