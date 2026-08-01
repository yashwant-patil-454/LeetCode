class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        int firstSkip[] = new int[nums.length + 1];
        int lastSkip[] = new int[nums.length + 1];

        for (int i = 0; i < nums.length - 1; i++) {
            firstSkip[i] = nums[i];
            lastSkip[i + 1] = nums[i + 1];
        }
        int first = robHelper(firstSkip);
        int last = robHelper(lastSkip);
        return Math.max(first, last);

    }

    int robHelper(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = nums[0] > nums[1] ? nums[0] : nums[1];

        for (int i = 2; i < nums.length; i++) {
            arr[i] = Math.max(arr[i - 2] + nums[i], arr[i - 1]);
        }
        return arr[nums.length - 1];
    }
}