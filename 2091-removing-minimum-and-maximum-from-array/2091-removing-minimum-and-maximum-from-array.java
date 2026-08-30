class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        // Find index of minimum and maximum
        for (int i = 1; i < n; i++) {

            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Put smaller index in left
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        // Case 1: Remove both from left
        int bothFromLeft = right + 1;

        // Case 2: Remove both from right
        int bothFromRight = n - left;

        // Case 3: Remove one from left and one from right
        int oneFromEach = (left + 1) + (n - right);

        return Math.min(
                bothFromLeft,
                Math.min(bothFromRight, oneFromEach));
    }
}