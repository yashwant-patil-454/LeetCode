/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstCritical = -1;
        int prevCritical = -1;

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;

        int index = 1;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {

            ListNode next = curr.next;

            // Check whether current node is a critical point
            boolean localMax = curr.val > prev.val && curr.val > next.val;

            boolean localMin = curr.val < prev.val && curr.val < next.val;

            if (localMax || localMin) {

                // First critical point
                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    // Distance between consecutive critical points
                    minDistance = Math.min(
                            minDistance,
                            index - prevCritical);

                    // Distance between first and current critical point
                    maxDistance = Math.max(
                            maxDistance,
                            index - firstCritical);
                }

                // Current critical point becomes previous critical point
                prevCritical = index;
            }

            prev = curr;
            curr = next;
            index++;
        }

        // Fewer than two critical points
        if (maxDistance == -1) {
            return new int[] { -1, -1 };
        }

        return new int[] { minDistance, maxDistance };
    }
}