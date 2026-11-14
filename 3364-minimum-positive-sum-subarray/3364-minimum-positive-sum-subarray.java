class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        // Try every possible starting index
        for (int i = 0; i < n; i++) {

            int sum = 0;

            // Generate subarrays starting from index i
            for (int j = i; j < n; j++) {

                // Add current element to subarray sum
                sum += nums.get(j);

                // Calculate current subarray length
                int length = j - i + 1;

                // Check whether length is within [l, r]
                if (length >= l && length <= r) {

                    // Consider only positive sums
                    if (sum > 0) {

                        // Update minimum positive sum
                        minSum = Math.min(minSum, sum);
                    }
                }

                // No need to check larger subarrays
                if (length >= r) {
                    break;
                }
            }
        }

        // Return -1 if no positive subarray exists
        return minSum == Integer.MAX_VALUE ? -1 : minSum;

    }
}