class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            int number = nums[i];
            while (number != 0) {

                int remaining = number % 10;
                sum += remaining;
                number /= 10;
            }
            if (sum == i) {
                return i;
            }

        }
        return -1;
    }
}