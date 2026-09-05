class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtracks(results, 0, new ArrayList<>(), nums);
        return results;
    }

    void backtracks(List<List<Integer>> result, int start, List<Integer> temp, int[] nums) {
        result.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);

            backtracks(result, i + 1, temp, nums);

            temp.remove(temp.size() - 1);
        }
    }

}