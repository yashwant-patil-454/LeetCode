class Graph {

    static final int INF = 1_000_000_000;

    int n;
    int[][] arr;

    public Graph(int n, int[][] edges) {

        this.n = n;
        arr = new int[n][n];
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
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            arr[from][to] = weight;

        }

        for (int k = 0; k < n; k++) {

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (arr[i][k] != INF &&
                            arr[k][j] != INF) {

                        arr[i][j] = Math.min(
                                arr[i][j],
                                arr[i][k] + arr[k][j]);
                    }
                }
            }
        }

    }

    public void addEdge(int[] edge) {
        int from = edge[0];
        int to = edge[1];
        int weight = edge[2];

        if (weight >= arr[from][to])
            return;

        arr[from][to] = weight;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (arr[i][from] != INF &&
                        arr[to][j] != INF) {

                    arr[i][j] = Math.min(
                            arr[i][j],
                            arr[i][from] + weight + arr[to][j]);
                }
            }
        }
    }

    public int shortestPath(int node1, int node2) {

        return arr[node1][node2] == INF ? -1 : arr[node1][node2];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */