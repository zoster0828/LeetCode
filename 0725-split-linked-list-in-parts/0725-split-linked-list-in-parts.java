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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        ListNode target = head;
        
        int length = 0 ;
        while(target != null) {            
            target = target.next;
            length ++;
        }
        
        int split = length / k;
        int nam = length % k;
        for(int i = 0 ; i < result.length ; i++) {
            result[i] = head;
            head = move(head, split*i, split*(i+1)+(nam-- > 0 ? 1 : 0));            
            if(head != null) {
                ListNode temp = head;
                head = head.next;    
                temp.next = null;
            }
        }
        
        return result;
    }
    
    private ListNode move(ListNode node, int move, int cut) {
        
        ListNode target = node;
        
        for(int i = 0 ; i <  cut-move-1 ; i++) {
            if(target == null) {
                break;
            }
            target = target.next;
        }        
        
        return target;
    }
}