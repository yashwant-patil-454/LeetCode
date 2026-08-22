class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int column = dungeon[0].length;
        int matrix[][] = new int[row][column];

        for (int i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                if (i == row - 1 && j == column - 1) {
                    matrix[i][j] = Math.max(1, 1 - dungeon[i][j]);
                } else if (i == row - 1) {
                    matrix[i][j] = Math.max(1, matrix[i][j + 1] - dungeon[i][j]);

                } else if (j == column - 1) {
                    matrix[i][j] = Math.max(1, matrix[i + 1][j] - dungeon[i][j]);

                } else {
                    int num = Math.min(matrix[i + 1][j], matrix[i][j + 1]);
                    matrix[i][j] = Math.max(1, num - dungeon[i][j]);

                }
            }
        }
        return matrix[0][0];

    }
}