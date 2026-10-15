class Solution {
    public int sumCounts(List<Integer> nums) {
        int result = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            int distinct = 0;

            for (int j = i; j < n; j++) {
                int value = nums.get(j);

                if (!freq.containsKey(value)) {
                    distinct++;
                }

                freq.put(value, freq.getOrDefault(value, 0) + 1);

                result += distinct * distinct;
            }
        }
        return result;
    }
}