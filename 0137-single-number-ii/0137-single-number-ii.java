class Solution {
    public int singleNumber(int[] nums) {
        int number = Arrays.stream(nums).boxed()
                .collect(
                        java.util.stream.Collectors.groupingBy(
                                java.util.function.Function.identity(),
                                java.util.stream.Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() < 3)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(0);

        return number;
    }
}