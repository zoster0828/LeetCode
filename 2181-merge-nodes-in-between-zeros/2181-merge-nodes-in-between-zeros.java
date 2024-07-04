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
        ListNode temp = head;
        ListNode result = null;
        ListNode answer = null;
        while(temp != null) {
            if(temp.val == 0) {
                temp = temp.next;
                if(temp == null) break;
                ListNode start = new ListNode(0);              

                while(temp.val != 0) {
                    start.val += temp.val;
                    temp = temp.next;
                }
                
                if(result == null) {
                    result = start;
                    answer = start;
                } 
                else {
                    result.next = start;
                    result = result.next;   
                }       
            }            
        }

        return answer;
    }
}