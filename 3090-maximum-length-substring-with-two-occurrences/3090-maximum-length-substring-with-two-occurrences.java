class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> count = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);

            // If current character occurs more than 2 times,
            // shrink the window from the left.
            while (count.get(ch) > 2) {
                char leftChar = s.charAt(left);

                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}