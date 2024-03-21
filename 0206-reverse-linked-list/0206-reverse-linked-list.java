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
    public ListNode reverseList(ListNode head) {
        Map<ListNode, ListNode> before = new HashMap();
        
        ListNode beforeNode = null;
        while(head != null) {
            
            before.put(head, beforeNode);
            
            beforeNode = head;
            
            if(head.next == null) {
                break;
            }
            head = head.next;            
        }
        
        ListNode temp = head;
        
        while(temp != null) {
            temp.next = before.get(temp);
            temp = temp.next;
        }
        
        return head;
    }
}