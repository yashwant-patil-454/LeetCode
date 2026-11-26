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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        Collections.sort(list);

        current = head;
        int i = 0;

        while (current != null) {
            current.val = list.get(i);
            i++;
            current = current.next;
        }

        return head;
    }
}