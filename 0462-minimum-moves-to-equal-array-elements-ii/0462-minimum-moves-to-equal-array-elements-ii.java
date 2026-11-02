class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        int element = nums[mid];
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            moves += Math.abs(element - nums[i]);
        }
        return moves;
    }
}