class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];

        // Square each number because the score uses nums[i] * nums[i].
        for (int i = 0; i < nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        // Sort squared values in ascending order.
        Arrays.sort(squares);

        long score = 0;
        int n = squares.length;

        // Subtract the smaller half.
        for (int i = 0; i < n / 2; i++) {
            score -= squares[i];
        }

        // Add the larger half.
        for (int i = n / 2; i < n; i++) {
            score += squares[i];
        }

        return score;
    }
}