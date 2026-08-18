class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        // Generate every subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {

            // Set ensures that the same number
            // is counted only once in this subarray
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count this subarray for every unique number
            for (int num : set) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
        }

        int answer = -1;

        // Find the largest number appearing
        // in exactly one subarray
        for (int num : count.keySet()) {

            if (count.get(num) == 1) {
                answer = Math.max(answer, num);
            }
        }

        return answer;
    }
}