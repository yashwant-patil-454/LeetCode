class Solution {
    public boolean detectCapitalUse(String word) {
        // Check whether all letters are uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Check whether all letters are lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Check whether only the first letter is uppercase
        if (Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }
}