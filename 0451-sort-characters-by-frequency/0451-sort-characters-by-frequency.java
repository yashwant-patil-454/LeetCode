class Solution {
    public String frequencySort(String s) {
        String result = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .map(entry -> String.valueOf(entry.getKey()).repeat(entry.getValue().intValue()))
                .collect(Collectors.joining());
        return result;
    }
}