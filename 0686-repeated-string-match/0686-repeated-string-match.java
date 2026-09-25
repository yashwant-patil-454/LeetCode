class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 0;
        StringBuilder str = new StringBuilder();
        while (str.length() < b.length()) {
            count++;
            str.append(a);
        }
        if (str.toString().contains(b)) {
            return count;
        }

        str.append(a);
        count++;

        if (str.toString().contains(b)) {
            return count;
        }

        return -1;
    }
}