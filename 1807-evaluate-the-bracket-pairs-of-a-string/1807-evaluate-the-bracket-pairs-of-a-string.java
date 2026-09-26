class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder newStr = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            // Start of a bracket pair
            if (s.charAt(i) == '(') {

                // Find the closing bracket
                int j = i + 1;

                while (s.charAt(j) != ')') {
                    j++;
                }

                // Extract key between '(' and ')'
                String key = s.substring(i + 1, j);

                // If key exists, append its value.
                // Otherwise append '?'
                if (map.containsKey(key)) {
                    newStr.append(map.get(key));
                } else {
                    newStr.append("?");
                }

                // Move i after ')'
                i = j + 1;

            } else {

                // Normal character
                newStr.append(s.charAt(i));

                i++;
            }
        }
        return newStr.toString();
    }
}