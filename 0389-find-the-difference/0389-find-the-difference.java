class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        // XOR all characters in s
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        // XOR all characters in t
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }

        return result;
    }
}