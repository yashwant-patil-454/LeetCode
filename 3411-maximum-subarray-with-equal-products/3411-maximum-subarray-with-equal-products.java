class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {

            int currentGcd = nums[i];
            long currentLcm = nums[i];
            long product = nums[i];

            for (int j = i + 1; j < n; j++) {

                product *= nums[j];

                currentGcd = gcd(currentGcd, nums[j]);

                currentLcm = (currentLcm / gcd((int) currentLcm, nums[j]))
                        * nums[j];

                if (product == currentLcm * currentGcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    private int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}