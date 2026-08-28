class Solution {
    public boolean isAnagram(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        int[] arr3 = new int[26];

        for (char ch : arr1) {
            arr3[ch - 'a']++;
        }

        for (char ch : arr2) {
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