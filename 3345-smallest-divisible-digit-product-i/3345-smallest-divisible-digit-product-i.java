class Solution {
    public int smallestNumber(int n, int t) {

        for (int i = n;; i++) {
            int num = findDivisibleBy(i);
            if (num % t == 0) {
                return i;
            }
        }
    }

    int findDivisibleBy(int i) {
        int product = 1;
        while (i != 0) {
            int digit = i % 10;
            product = product * digit;
            i /= 10;
        }
        return product;
    }
}