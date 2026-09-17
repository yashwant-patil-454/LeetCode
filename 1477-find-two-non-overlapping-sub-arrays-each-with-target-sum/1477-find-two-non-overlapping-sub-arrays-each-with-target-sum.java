class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int left = 0;
        int n = arr.length;
        int INF = n + 1;
        int answer = INF;
        int sum = 0;
        int[] solutionArr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            solutionArr[i] = INF;
        }
        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                int curentAnswer = right - left + 1;
                if (solutionArr[left] != INF) {
                    answer = Math.min(answer, solutionArr[left] + curentAnswer);
                }
                solutionArr[right + 1] = Math.min(solutionArr[right], curentAnswer);
            } else {
                solutionArr[right + 1] = solutionArr[right];
            }
        }
        return answer == INF ? -1 : answer;
    }
}