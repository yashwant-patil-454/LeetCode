class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    continue;
                }
                // Check the top neighbor.
                if (i > 0 &&
                        result[i - 1][j] != Integer.MAX_VALUE) {

                    result[i][j] = Math.min(
                            result[i][j],
                            result[i - 1][j] + 1);
                }

                // Check the left neighbor.
                if (j > 0 &&
                        result[i][j - 1] != Integer.MAX_VALUE) {

                    result[i][j] = Math.min(
                            result[i][j],
                            result[i][j - 1] + 1);
                }
            }
        }

        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (mat[i][j] == 0) {
                    continue;
                }

                // Check the bottom neighbor.
                if (i < row - 1 &&
                        result[i + 1][j] != Integer.MAX_VALUE) {

                    result[i][j] = Math.min(
                            result[i][j],
                            result[i + 1][j] + 1);
                }

                // Check the right neighbor.
                if (j < col - 1 &&
                        result[i][j + 1] != Integer.MAX_VALUE) {

                    result[i][j] = Math.min(
                            result[i][j],
                            result[i][j + 1] + 1);
                }
            }
        }

        return result;
    }
}