class NumArray {
    int preFixSum[] = null;

    public NumArray(int[] nums) {
        preFixSum = new int[nums.length];
        preFixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preFixSum[i] = preFixSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        if (left == 0)
            return preFixSum[right];

        return preFixSum[right] - preFixSum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */