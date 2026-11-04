class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        int[] result = new int[n - k + 1];

        // Deque stores indexes, not actual values
        Deque<Integer> dq = new ArrayDeque<>();

        int index = 0;

        for (int i = 0; i < n; i++) {

            // Remove indexes outside the current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            // because they cannot be the maximum
            while (!dq.isEmpty() &&
                    nums[dq.peekLast()] < nums[i]) {

                dq.pollLast();
            }

            // Add current element index
            dq.offerLast(i);

            // Window is ready when i >= k - 1
            if (i >= k - 1) {

                // Front always contains maximum element index
                result[index++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}