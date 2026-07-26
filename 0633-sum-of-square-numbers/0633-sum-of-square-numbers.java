class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);

        while (left <= right) {
            long num = 1L * left * left + 1L * right * right;

            if (num == c) {
                return true;
            } else if (num > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}