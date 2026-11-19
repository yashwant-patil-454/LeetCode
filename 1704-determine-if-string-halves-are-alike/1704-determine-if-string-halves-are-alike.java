class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < mid; i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (isVowel(s.charAt(i + mid))) {
                count--;
            }
        }

        return count == 0;
    }

    private boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' || ch == 'u';
    }
}
