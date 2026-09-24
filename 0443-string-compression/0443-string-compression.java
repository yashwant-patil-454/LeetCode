class Solution {
    public int compress(char[] chars) {
        int start = 0;
        int newIndex = 0;
        while (start < chars.length) {
            char ch = chars[start];
            int count = 0;
            int end = start;
            while (end < chars.length && chars[end] == ch) {
                count++;
                end++;
            }
            // Write the character
            chars[newIndex] = ch;
            newIndex++;

            // If count > 1, write each digit of count
            if (count > 1) {

                String countString = String.valueOf(count);

                for (char digit : countString.toCharArray()) {
                    chars[newIndex] = digit;
                    newIndex++;
                }
            }

            start = end;
        }

        return newIndex;
    }
}