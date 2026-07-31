class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int pushCount = 0;
        for (int i = 25; i >= 0; i--) {
            pushCount += ((25 - i) / 8 + 1) * freq[i];
        }
        return pushCount;
    }
}