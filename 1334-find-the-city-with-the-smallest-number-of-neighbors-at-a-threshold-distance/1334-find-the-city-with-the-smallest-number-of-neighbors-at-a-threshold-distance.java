class Solution {
    final static int INF = 99999;

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = INF;
                }
            }
        }

        for (int[] edge : edges) {
            int start = edge[0];
            int to = edge[1];
            int weight = edge[2];
            arr[start][to] = weight;
            arr[to][start] = weight;

        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (arr[i][k] != INF && arr[k][j] != INF && arr[i][k] + arr[k][j] < arr[i][j])
                        arr[i][j] = arr[i][k] + arr[k][j];
                }
            }
        }
        int totalNeighbour = Integer.MAX_VALUE;
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i][j] <= distanceThreshold) {
                    count++;
                }

            }

            if (count <= totalNeighbour) {
                totalNeighbour = count;
                answer = i;
            }
        }

        return answer;

    }
}