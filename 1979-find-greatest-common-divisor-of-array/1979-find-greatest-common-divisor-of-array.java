class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int first = nums[0];
        int second = nums[nums.length - 1];
        int gcd = -1;
        for (int i = 1; i <= second; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}