class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder str = new StringBuilder();

        int left = 0;

        for (int i = 0; i < s.length(); i++) {

            if (left < spaces.length && spaces[left] == i) {
                str.append(" ");
                left++;
            }

            str.append(s.charAt(i));

        }

        return str.toString();
    }
}