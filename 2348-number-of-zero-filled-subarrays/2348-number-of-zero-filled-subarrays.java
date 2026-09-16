class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long answer = 0;
        long consecutiveZeros = 0;

        for (int num : nums) {

            if (num == 0) {
                // Extend the current consecutive-zero subarray.
                consecutiveZeros++;

                // Every zero can form a new subarray ending at this position.
                answer += consecutiveZeros;

            } else {
                // A non-zero value breaks the consecutive-zero sequence.
                consecutiveZeros = 0;
            }
        }

        return answer;
    }
}