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
        ListNode middle=head;  
        int i = 1;      
        while(head.next != null) {
            if(i % 2 == 0) {
                middle = middle.next;
            }
            head = head.next;
            i++;
        }
        if(i%2 ==0) {
            middle = middle.next;
        }

        return middle;
    }
}