class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2 * k) {

            // Find the ending index of the first k characters.
            int end = Math.min(i + k, s.length());

            // Extract the first k characters.
            String newStr = s.substring(i, end);

            // Reverse the first k characters.
            StringBuilder rev = new StringBuilder(newStr);
            str.append(rev.reverse());

            // Append the next k characters without reversing.
            int nextEnd = Math.min(i + 2 * k, s.length());

            str.append(s.substring(end, nextEnd));
        }

        return str.toString();
    }
}