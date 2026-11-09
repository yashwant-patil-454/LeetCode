class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder string1 = new StringBuilder();

        for (String word : word1) {
            string1.append(word);
        }

        StringBuilder string2 = new StringBuilder();

        for (String word : word2) {
            string2.append(word);
        }
        return string1.toString().equals(string2.toString());
    }
}