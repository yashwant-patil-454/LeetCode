class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            int j = i;
            while (j >= 0) {
                if (nums[j] >= max) {
                    max = nums[j];
                }
                j--;
            }
            int l = i;
            while (l <= nums.length - 1) {
                if (nums[l] <= min) {
                    min = nums[l];
                }
                l++;
            }
            int diff = max - min;
            if (diff <= k) {
                return i;
            }
        }
        return -1;
    }
}