class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += getPalindromeCount(s, i, i);
            count += getPalindromeCount(s, i, i + 1);
        }
        return count;

    }

    private int getPalindromeCount(String str, int left, int right) {
        int count = 0;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}