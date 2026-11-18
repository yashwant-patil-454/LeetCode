class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    String str = words[i];
                    String str2 = words[j];
                    if (str2.contains(str)) {
                        list.add(str);
                        break;
                    }
                }
            }
        }
        return list;
    }
}