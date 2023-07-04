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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int max = 0;
        for(int i = 0 ; i < list.size() / 2 ; i++) {
            int sum = list.get(i);
            sum += list.get(list.size() - i -1);
            if(sum > max) {
                max = sum;
            }
        }
        
        return max;
    }
}