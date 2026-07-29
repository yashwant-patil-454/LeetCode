class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int arr[][] = new int[n + 1][n + 1];
        for (int level = n - 1; level >= 0; level--) {
            for (int j = 0; j < triangle.get(level).size(); j++) {
                arr[level][j] = triangle.get(level).get(j) + Math.min(arr[level + 1][j], arr[level + 1][j + 1]);
            }
        }
        return arr[0][0];
    }
}