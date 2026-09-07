class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        // Edge case: empty input
        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] map = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };

        StringBuilder current = new StringBuilder();

        backtrack(0, digits, map, current, result);

        return result;
    }

    void backtrack(int start, String digits, String[] map, StringBuilder current, List<String> result) {
        if (start == digits.length()) {
            result.add(current.toString());
            return;
        }
        // Get the digit
        char digit = digits.charAt(start);

        // Get corresponding letters
        String letters = map[digit - '0'];

        for (char ch : letters.toCharArray()) {

            current.append(ch);

            backtrack(start + 1, digits, map, current, result);

            current.deleteCharAt(current.length() - 1);
        }

    }
}