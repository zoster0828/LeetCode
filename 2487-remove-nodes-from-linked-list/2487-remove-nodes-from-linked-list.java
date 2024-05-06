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
        Stack<ListNode> stack = new Stack();
        
        ListNode temp = head.next;        
        stack.add(head);
        
        ListNode result = head;
        while(temp != null) {
            while(true) {
                if(stack.isEmpty()) {
                    result = temp;
                    stack.add(result);
                    break;
                }
                
                if(stack.peek().val < temp.val) {
                    stack.pop();
                } else {
                    stack.peek().next = temp;
                    stack.add(temp);
                    break;
                }
            }
            
            
            temp = temp.next;
        }
        
        return result;
    }
}