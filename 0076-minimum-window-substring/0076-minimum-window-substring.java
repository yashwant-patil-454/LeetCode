class Solution {
    public String minWindow(String s, String t) {
        int[] freqT = new int[256];
        int[] freqS = new int[256];

        for (int i = 0; i < t.length(); i++) {
            freqT[t.charAt(i)]++;
        }

        int right = 0;
        String answer = "";
        int minLength = Integer.MAX_VALUE;
        for (int left = 0; left < s.length(); left++) {

            while (right < s.length() && !isValid(freqS, freqT)) {
                freqS[s.charAt(right)]++;
                right++;
            }

            if (isValid(freqS, freqT) && minLength > right - left) {
                answer = s.substring(left, right);
                minLength = right - left;
            }
            freqS[s.charAt(left)]--;
        }
        return answer;

    }

    boolean isValid(int[] freqS, int[] freqT) {
        for (int i = 0; i < freqT.length; i++) {
            if (freqT[i] > freqS[i]) {
                return false;
            }
        }
        return true;
    }
}