class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer in s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // Always move the pointer in t
            j++;
        }

        // If all characters of s are matched, return true
        return i == s.length();
    }
}