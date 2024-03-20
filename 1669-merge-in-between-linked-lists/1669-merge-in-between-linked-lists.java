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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {        
        
        ListNode head = list2;        
        while(list2.next != null) {
            list2 = list2.next;            
        }
        ListNode tail = list2;
        
        ListNode next = list1;
        ListNode tempHead = null;
        int i = 0;
        while(true) {
            int val = i;
            
            if(val+1 == a) {
                tempHead = next;
            }
            
            if(val-1 == b) {
                tempHead.next = head;
                tail.next = next;
                break;
            }
            
            i++;
            next = next.next;
        }
        
        return list1;
    }
}