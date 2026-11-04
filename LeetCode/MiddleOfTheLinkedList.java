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
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        ListNode prev = head;
        while(prev != null && prev.next != null)
        {
            node = node.next;
            prev = prev.next.next; 
        }
        return node;
        
    }
}
