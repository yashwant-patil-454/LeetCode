class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean allEven = true;
        int min = Integer.MAX_VALUE;

        for (int num : nums1) {
            min = Math.min(min, num);

            if (num % 2 != 0) {
                allEven = false;
            }
        }

        // Case 1: Already all even
        if (allEven) {
            return true;
        }

        // Case 2: Minimum is odd, so every even number
        // can subtract this minimum odd number.
        return min % 2 != 0;
    }
}