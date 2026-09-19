class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int currentMax = 0;
        int max = Integer.MIN_VALUE;
        int currentMin = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];

            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);

            currentMin = Math.min(nums[i], currentMin + nums[i]);
            min = Math.min(min, currentMin);
        }

        if (max < 0) {
            return max;
        }
        return Math.max(max, totalSum - min);
    }
}