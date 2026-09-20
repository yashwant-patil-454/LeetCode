class Solution {
    public int reverseDegree(String s) {
        int product = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = 'z' - s.charAt(i) + 1;
            product += value * (i + 1);
        }
        return product;
    }
}