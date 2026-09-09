class Solution {
    public long countCommas(long n) {
        // long comma = Math.max(n - 999, 0);

        long total = 0;
        long power = 1000;

        while (power <= n) {
            total += n - power + 1;
            power *= 1000;
        }
        return total;
        // return comma;
    }
}