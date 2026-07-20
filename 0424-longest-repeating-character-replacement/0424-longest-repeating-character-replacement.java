class Solution {
    public int characterReplacement(String s, int k) {
        int maxWindow = 0;
        int maxFreq = 0;
        int left = 0;
        int[] freqCount = new int[26];

        for (int right = 0; right < s.length(); right++) {
            freqCount[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freqCount[s.charAt(right) - 'A']);
            int window = right - left + 1;
            if (window - maxFreq > k) {
                freqCount[s.charAt(left) - 'A']--;
                left++;
            }
            window = right - left + 1;
            maxWindow = Math.max(maxWindow, window);
        }

        return maxWindow;

    }
}