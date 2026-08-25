class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Store all numbers for O(1) lookup
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int multiple = k;; multiple += k) {

            if (!set.contains(multiple)) {
                return multiple;
            }
        }
    }
}