class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] check = new boolean[arr.length];
        int curr = start;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            curr = queue.poll();
            if (check[curr]) {
                continue;
            }
            check[curr] = true;
            if (arr[curr] == 0) {
                return true;
            }

            if (curr + arr[curr] < arr.length) {
                queue.add(curr + arr[curr]);
            }
            if (curr - arr[curr] >= 0) {
                queue.add(curr - arr[curr]);
            }
            // arr[curr] = -arr[curr];
        }
        return false;
    }
}