class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // Try every possible substring length
        for (int i = 1; i <= n / 2; i++) {

            if (n % i != 0) {
                continue;
            }

            String pattern = s.substring(0, i);

            StringBuilder result = new StringBuilder();

            // Append the pattern multiple times
            for (int j = 0; j < n / i; j++) {
                result.append(pattern);
            }

            // Check whether constructed string equals original
            if (result.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }

}