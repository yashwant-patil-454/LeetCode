class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCoins = 0;
        int tenCoins = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCoins++;
            } else if (bill == 10) {
                if (fiveCoins == 0) {
                    return false;
                }
                fiveCoins--;
                tenCoins++;
            } else if (bill == 20) {
                if (tenCoins >= 1 && fiveCoins >= 1) {
                    fiveCoins--;
                    tenCoins--;
                } else if (fiveCoins >= 3) {
                    fiveCoins -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}