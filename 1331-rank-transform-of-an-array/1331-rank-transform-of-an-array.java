class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int start = 0; start < temp.length; start++) {
            if (!map.containsKey(temp[start])) {
                map.put(temp[start], rank++);
            }
        }

        for (int start = 0; start < arr.length; start++) {
            arr[start] = map.get(arr[start]);
        }
        return arr;

    }
}