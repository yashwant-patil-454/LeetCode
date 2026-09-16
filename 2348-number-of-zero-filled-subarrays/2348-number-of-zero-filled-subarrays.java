class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int left = 0;
        long count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {

                count += (long) (right - left + 1);
            } else {
                left = right + 1;
            }
        }
        return count;
    }
}