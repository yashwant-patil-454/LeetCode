class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;

        if (x >= 0) {
            int rev = 0;
            while (x != 0) {
                rev = rev * 10 + x % 10;
                x = x / 10;
            }
            if (originalNumber == rev) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}