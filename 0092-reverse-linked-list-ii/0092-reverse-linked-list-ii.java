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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // Dummy node handles the case when left = 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to the node before left
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Current points to the first node to reverse
        ListNode curr = prev.next;

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {

            ListNode nextNode = curr.next;

            curr.next = nextNode.next;

            nextNode.next = prev.next;

            prev.next = nextNode;
        }

        return dummy.next;
    }
}
