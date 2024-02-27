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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = head;
        Map<ListNode, ListNode> parentMap = new HashMap();
        while(head != null) {
            if(head.next != null) {
                parentMap.put(head.next, head);
                head = head.next;
            } else {
                break;
            }
        }
                
        for(int i = 1 ; i < n ; i++) {
            head = parentMap.get(head);                        
        }
        
        ListNode prev = parentMap.get(head);
        if(prev == null) {
            return head.next;
        }
        prev.next = head.next;
        
        return result;
    }
}