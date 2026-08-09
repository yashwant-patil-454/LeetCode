class Solution {
    public int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        int[] squaresArr = new int[n + 1];

        Arrays.fill(squaresArr, n + 1);

        squaresArr[0] = 0;

        // Calculate minimum squares for every amount
        for (int i = 1; i <= n; i++) {

            // Try every perfect square
            for (int square : squares) {

                // Square cannot be greater than current amount
                if (square > i) {
                    break;
                }

                // Use current square
                squaresArr[i] = Math.min(
                        squaresArr[i],
                        squaresArr[i - square] + 1);
            }
        }

        return squaresArr[n];
    }
}