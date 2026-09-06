class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, n, k, 1, new ArrayList<>());
        return result;
    }

    public void backtrack(List<List<Integer>> result, int n, int k, int start, List<Integer> list) {

        if (list.size() == k) {
            result.add(new ArrayList<>(list));
          //  return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);

            backtrack(result, n, k, i + 1, list);

            list.remove(list.size() - 1);

        }

    }
}