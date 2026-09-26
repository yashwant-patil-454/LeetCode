class Solution {
    public int jump(int[] nums) {
        int finalJump = nums.length - 1;
        if (nums.length == 1) {
            return 0;
        }
        int count = 0, window = 0, lastIndexVisit = 0;
        for (int i = 0; i < nums.length; i++) {
            window = Math.max(window, i + nums[i]);
            if (i == lastIndexVisit) {
                lastIndexVisit = window;
                count++;
                if (window >= finalJump) {
                    return count;
                }
            }
        }
        return count;
    }
}