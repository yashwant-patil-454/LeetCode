class Solution {
    public boolean checkDivisibility(int n) {
        int number = getSumAndProduct(n);
        return n % number == 0;
    }

    int getSumAndProduct(int n) {
        int sum = 0;
        int product = 1;

        while (n != 0) {

            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }

        return sum + product;

    }
}
