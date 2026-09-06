class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(result, new ArrayList<>(), candidates, target, 0, 0);
        return result;
    }

    void combination(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int sum, int start) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        // Sum exceeded target
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {

            list.add(candidates[i]);

            combination(result, list, candidates, target, sum + candidates[i], i);

            list.remove(list.size() - 1);
        }
    }
}