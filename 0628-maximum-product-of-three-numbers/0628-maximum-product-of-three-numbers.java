class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }

            if (smallest > num) {
                secondSmall = smallest;
                smallest = num;

            } else if (secondSmall > num) {
                secondSmall = num;
            }
        }

        int product1 = first * second * third;
        int product2 = first * smallest * secondSmall;
        return Math.max(product1, product2);

    }
}