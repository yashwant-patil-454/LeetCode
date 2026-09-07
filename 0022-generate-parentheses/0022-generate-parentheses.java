class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(
                n,
                0, // open count
                0, // close count
                new StringBuilder(),
                result);

        return result;
    }

    void backtrack(int n, int start, int end, StringBuilder parenthesis, List<String> result) {
        if (parenthesis.length() == 2 * n) {
            result.add(parenthesis.toString());
            return;
        }
        if (start < n) {
            parenthesis.append('(');

            backtrack(n, start + 1, end, parenthesis, result);

            parenthesis.deleteCharAt(parenthesis.length() - 1);
        }

        if (end < start) {

            parenthesis.append(')');

            backtrack(n, start, end + 1, parenthesis, result);

            parenthesis.deleteCharAt(parenthesis.length() - 1);
        }
    }
}