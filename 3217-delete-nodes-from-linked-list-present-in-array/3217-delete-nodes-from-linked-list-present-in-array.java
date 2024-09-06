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
    public ListNode modifiedList(int[] nums, ListNode head) {
        boolean target[] = new boolean[100001];
        for(int i : nums) {
            target[i] = true;
        }

        ListNode result = null;
        ListNode returnList = result;

        while(head != null) {
            while(head != null && target[head.val]) {
                head = head.next;                
            }
            if(head == null) continue;

            if(result == null) {
                result = new ListNode(head.val);                
                returnList = result;
            } else {
                result.next = new ListNode(head.val);
                result = result.next;
            }

            head = head.next;
        }

        return returnList;
    }
}