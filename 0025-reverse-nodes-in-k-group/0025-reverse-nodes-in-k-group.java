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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupprev = dummy;
        while(true){
            ListNode kth = groupprev;
            for(int i = 0;i<k && kth != null;i++){
                kth = kth.next;
            }
            if(kth==null){
                break;
            }
            ListNode groupNext = kth.next;
            ListNode prev = groupNext;
            ListNode curr = groupprev.next;
            while(curr != groupNext){
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            ListNode oldGroupHead = groupprev.next;
            groupprev.next = kth;
            groupprev = oldGroupHead;
        }
        return dummy.next;
        
    }
}