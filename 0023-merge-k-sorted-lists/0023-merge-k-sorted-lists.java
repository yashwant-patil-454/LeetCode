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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode list : lists) {

            if (list != null) {
                queue.add(list);
            }
        }
        ListNode newList = new ListNode(-1);
        ListNode curr = newList;

        while (!queue.isEmpty()) {
            ListNode smallest = queue.poll();
            curr.next = smallest;
            curr = curr.next;

            if (smallest.next != null) {
                queue.add(smallest.next);
            }
        }
        return newList.next;
    }
}