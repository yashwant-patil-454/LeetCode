class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        int count = 0;
        // Stores distinct 3-digit numbers
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            // First digit cannot be 0
            if (digits[i] == 0) {
                continue;
            }

            for (int j = 0; j < n; j++) {

                // Cannot reuse the same digit
                if (i == j) {
                    continue;
                }

                for (int k = 0; k < n; k++) {

                    // Cannot reuse the same digit
                    if (i == k || j == k) {
                        continue;
                    }

                    // Last digit must be even
                    if (digits[k] % 2 != 0) {
                        continue;
                    }

                    // Construct 3-digit number
                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    count++;
                    set.add(num);
                }
            }
        }

        return set.size();
    }
}