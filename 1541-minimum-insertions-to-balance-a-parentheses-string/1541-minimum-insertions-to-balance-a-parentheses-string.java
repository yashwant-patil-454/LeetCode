class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
            } else {
                // A closing pair must contain two consecutive ')'.
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    // Consume the second ')' as part of this pair.
                    i++;
                } else {
                    // Insert ')' to complete the closing pair.
                    insertions++;
                }

                // The closing pair must match an opening '('.
                if (open > 0) {
                    open--;
                } else {
                    // Insert '(' because no opening parenthesis exists.
                    insertions++;
                }
            }
        }

        // Each unmatched '(' requires two closing parentheses.
        insertions += open * 2;

        return insertions;
    }
}