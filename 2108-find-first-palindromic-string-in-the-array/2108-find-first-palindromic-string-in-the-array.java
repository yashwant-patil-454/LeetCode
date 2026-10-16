class Solution {
    public String firstPalindrome(String[] words) {
        // Check each word in the given array in order
        for (String word : words) {

            int left = 0;
            int right = word.length() - 1;

            // Compare characters from both ends
            while (left < right) {

                // If characters differ, this word is not a palindrome
                if (word.charAt(left) != word.charAt(right)) {
                    break;
                }

                // Move both pointers toward the center
                left++;
                right--;
            }

            // If pointers meet or cross, every pair matched
            if (left >= right) {
                return word; // Return the first palindrome
            }
        }

        // No palindrome was found
        return "";
    }
}