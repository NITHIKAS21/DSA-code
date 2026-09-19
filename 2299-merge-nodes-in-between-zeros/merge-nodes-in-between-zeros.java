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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode ans = head;
        int sum = 0;

        while (curr != null) {

            if (curr.val == 0) {
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum = 0;
            } else {
                sum += curr.val;
            }

            curr = curr.next;
        }

        return head.next;
    }
}