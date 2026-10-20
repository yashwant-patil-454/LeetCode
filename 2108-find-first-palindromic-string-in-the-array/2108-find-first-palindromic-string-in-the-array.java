class Solution {
    public String firstPalindrome(String[] words) {
         // Check each word in order
        for (String word : words) {

            // Reverse the word and compare it with the original
            String reversed = new StringBuilder(word).reverse().toString();

            // If both strings are equal, return the first palindrome
            if (word.equals(reversed)) {
                return word;
            }
        }

        // No palindrome found
        return "";
    }
}