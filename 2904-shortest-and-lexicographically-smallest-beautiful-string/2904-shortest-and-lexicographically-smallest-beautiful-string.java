class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int count = 0;
        int[] once = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                once[count++] = i;
            }
        }

        if (count < k) {
            return "";
        }
        String answer = null;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < count; i++) {
            int start = once[i];
            int end = once[i + k - 1];
            int length = end - start + 1;
            String str = s.substring(start, end + 1);
            if (length < minLength) {
                minLength = length;
                answer = str;
            } else if (length == minLength && str.compareTo(answer) < 0) {
                answer = str;
            }

        }
        return answer;
    }
}