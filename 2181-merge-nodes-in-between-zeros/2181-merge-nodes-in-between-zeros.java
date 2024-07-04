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
        ListNode temp = head.next;
        ListNode result = new ListNode(0);
        ListNode answer = result;
        while(temp != null) {
            while(temp.val != 0) {
                result.val += temp.val;
                temp = temp.next;
            }            

            temp = temp.next;
            if(temp == null) break;     

            result.next = new ListNode(0);
            result = result.next;   
        }

        return answer;
    }
}