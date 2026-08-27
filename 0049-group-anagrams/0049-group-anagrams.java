class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String str1 = new String(chars);
            if (!map.containsKey(str1)) {
                map.put(str1, new ArrayList<>());
            }

            map.get(str1).add(str);
        }
        return new ArrayList<>(map.values());
    }
}