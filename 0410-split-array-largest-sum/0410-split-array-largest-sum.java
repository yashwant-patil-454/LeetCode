class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (checkSubArray(nums, mid, k)) {

                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    boolean checkSubArray(int[] nums, int mid, int k) {
        int subArray = 1;
        int sum = 0;
        for (int num : nums) {
            if (sum + num > mid) {

                // Start a new subarray
                subArray++;
                sum = num;

                // More than k subArray required
                if (subArray > k) {
                    return false;
                }

            } else {
                sum += num;
            }
        }
        return true;
    }
}