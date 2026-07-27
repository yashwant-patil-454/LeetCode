class Solution {
    public int maxProduct(int[] nums) {
        int first = nums[0] > nums[1] ? nums[0] : nums[1];
        int second = nums[0] < nums[1] ? nums[0] : nums[1];

        for (int i = 2; i < nums.length; i++) {
            int num = nums[i];

            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }

        return (first - 1) * (second - 1);
    }
}