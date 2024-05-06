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
        List<ListNode> list = new ArrayList();
        
        ListNode temp = head.next;        
        list.add(head);
        
        ListNode result = head;
        while(temp != null) {
            while(true) {
                if(list.size() == 0) {
                    result = temp;
                    list.add(result);
                    break;
                }
                
                if(list.get(list.size()-1).val < temp.val) {
                    list.remove(list.size()-1);
                } else {
                    list.get(list.size()-1).next = temp;
                    list.add(temp);
                    break;
                }
            }
            
            
            temp = temp.next;
        }
        
        return result;
    }
}