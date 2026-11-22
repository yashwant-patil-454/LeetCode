class Solution {
    public boolean checkString(String s) {

        if (s.length() == 1 && (s.equals("a") || s.equals("b"))) {
            return true;
        }
        if (s.length() >= 2) {
            int aIndex = s.lastIndexOf('a');
            int bIndex = s.indexOf('b');
            if ((bIndex > aIndex) || (bIndex == -1)) {
                return true;
            }
        }
        return false;
    }
}