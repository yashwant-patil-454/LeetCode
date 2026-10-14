class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum == 0) {
            return "";
        }

        if (sum > num * 9) {
            return "";
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (sum >= 9) {
                str.append('9');
                sum -= 9;
            } else {
                str.append((char) ('0' + sum));
                sum = 0;
            }
        }
        return str.toString();
    }
}