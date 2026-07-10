class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] brr = new int[nums.length];
        while (left < right) {
            int leftSum = nums[left] * nums[left];
            int rightSum = nums[right] * nums[right];
            if (leftSum > rightSum) {
                brr[index--] = leftSum;
                left++;
            } else {
                brr[index--] = rightSum;
                right--;
            }
        }
        brr[0] = nums[left] * nums[left];
        return brr;
    }
}