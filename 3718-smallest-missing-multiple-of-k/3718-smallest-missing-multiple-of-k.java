class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Store all numbers for O(1) lookup
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}