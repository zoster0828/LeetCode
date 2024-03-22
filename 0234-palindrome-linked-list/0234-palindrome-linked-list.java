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
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList();
        while(head != null) {
            values.add(head.val);
            head = head.next;
        }
        
        int length = values.size();
        for(int i = 1 ; i < (length / 2) + 1 ; i++) {
            int left = length / 2 - i;
            int right = length / 2 -1 + i;
            if(length % 2 == 1) {
                right = length / 2 + i;
            }
            
            if(values.get(left) != values.get(right)) return false;
       }
        
        return true;
    }
}