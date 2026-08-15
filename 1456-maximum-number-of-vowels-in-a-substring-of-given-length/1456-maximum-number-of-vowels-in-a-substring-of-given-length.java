class Solution {
    public int maxVowels(String s, int k) {
        int windowSize = 0;
        int maxWindow = 0;
        String str = "aeiou";
        for (int i = 0; i < k; i++) {
            if (str.indexOf(s.charAt(i)) != -1) {
                windowSize++;
            }
        }
        maxWindow = windowSize;
        for (int i = k; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i - k)) != -1) {
                windowSize--;
            }
            if (str.indexOf(s.charAt(i)) != -1) {
                windowSize++;
            }
            maxWindow = Math.max(windowSize, maxWindow);
        }
        return maxWindow;
    }
}