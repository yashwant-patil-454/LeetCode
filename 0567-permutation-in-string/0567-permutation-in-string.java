class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int s1Freq[] = new int[26];
        int s2Freq[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
        }
        int windowSize = s1.length();
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            s2Freq[s2.charAt(right) - 'a']++;
            if (right - left + 1 > windowSize) {
                s2Freq[s2.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 == windowSize) {

                boolean same = true;
                for (int i = 0; i < 26; i++) {
                    if (s1Freq[i] != s2Freq[i]) {
                        same = false;
                    }
                }
                if (same) {
                    return true;
                }
            }
        }
        return false;
    }

}