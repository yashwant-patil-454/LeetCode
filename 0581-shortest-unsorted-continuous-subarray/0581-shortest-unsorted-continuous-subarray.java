class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = -1;
        int right = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= max) {
                max = nums[i];
            } else {
                right = i;
            }

        }

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] <= min) {
                min = nums[i];
            } else {
                left = i;
            }

        }

        if (left == -1) {
            return 0;
        }
        return right - left + 1;
    }
}