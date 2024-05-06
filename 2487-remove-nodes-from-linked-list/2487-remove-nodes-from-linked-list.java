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
    public ListNode removeNodes(ListNode head) {
        ListNode[] stack = new ListNode[100001];
        int po = 0;
        
        ListNode temp = head.next;        
        stack[po] = head;
        po++;
        
        ListNode result = head;
        while(temp != null) {
            while(true) {
                if(po == 0) {
                    result = temp;
                    stack[po++] = result;
                    break;
                }
                
                if(stack[po-1].val < temp.val) {
                    po--;
                } else {
                    stack[po-1].next = temp;
                    stack[po++] = temp;
                    break;
                }
            }
            
            
            temp = temp.next;
        }
        
        return result;
    }
}