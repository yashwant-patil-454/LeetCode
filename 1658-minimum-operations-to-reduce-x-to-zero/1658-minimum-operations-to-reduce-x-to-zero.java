class Solution {

    public int minOperations(int[] nums, int x) {

        int n = nums.length;

        // Step 1: Calculate total sum
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        // Step 2: We need to keep a subarray whose sum is totalSum - x
        int target = totalSum - x;

        // If target is negative, we cannot achieve x
        if (target < 0) {
            return -1;
        }

        // If target is 0, we need to remove the entire array
        if (target == 0) {
            return n;
        }

        int left = 0;
        int currentSum = 0;
        int maxLength = -1;

        // Step 3: Find longest subarray having sum = target
        for (int right = 0; right < n; right++) {

            // Add current element
            currentSum += nums[right];

            // If sum becomes greater than target,remove elements from the left
            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            // We found a valid subarray
            if (currentSum == target) {

                int length = right - left + 1;

                // Keep the longest one
                maxLength = Math.max(maxLength, length);
            }
        }

        // No valid subarray
        if (maxLength == -1) {
            return -1;
        }

        // Elements outside the subarray are the elements we remove
        return n - maxLength;
    }
}