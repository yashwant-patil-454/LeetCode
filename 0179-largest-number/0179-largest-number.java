class Solution {
    public String largestNumber(int[] nums) {
        // Convert int[] to String[]
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting
        Arrays.sort(arr, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;

            // If a+b is bigger, a should come first
            return order2.compareTo(order1);
        });

        // If largest number is "0", return "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for (String str : arr) {
            result.append(str);
        }

        return result.toString();

    }
}