class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    String str = words[i];
                    String str2 = words[j];
                    if (str.contains(str2)) {
                        set.add(str2);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}