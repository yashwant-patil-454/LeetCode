class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr3 = new int[26];

        for (char ch : s.toCharArray()) {
            arr3[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            arr3[ch - 'a']--;
        }
        for (int count : arr3) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }
}