class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            // Increase the frequency of the current number
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            // Return as soon as the majority condition is satisfied
            if (count > n / 2) {
                return num;
            }
        }

        return -1;
    }
}