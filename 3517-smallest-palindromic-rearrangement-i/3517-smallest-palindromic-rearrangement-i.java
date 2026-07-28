class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        String middleChar = (n & 1) == 1
                ? s.charAt(n / 2) + ""
                : "";
        StringBuilder half = new StringBuilder();
        int[] freq = new int[26];
        for (int i = 0; i < s.length() / 2; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                half.append((char) ('a' + i));
            }
        }
        return half.toString() + middleChar + half.reverse().toString();
    }
}