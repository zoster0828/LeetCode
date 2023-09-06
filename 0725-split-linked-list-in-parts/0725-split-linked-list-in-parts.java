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
        ListNode temp = head;

        int lengthOfListNode = getLengthOfListNode(temp) ;

        int quotient = lengthOfListNode / k;
        int remainder = lengthOfListNode % k;
        for(int multiple = 0 ; multiple < k ; multiple++) {
            result[multiple] = head;
            int startPos = quotient*multiple;
            int endPos = quotient*(multiple+1)+(remainder-- > 0 ? 1 : 0);
            int nodeLength = endPos - startPos -1;
            head = moveToNextHead(head, nodeLength);
        }

        return result;
    }

    private int getLengthOfListNode(ListNode temp) {
        int lengthOfListNode = 0;
        while(temp != null) {
            temp = temp.next;
            lengthOfListNode++;
        }
        return lengthOfListNode;
    }

    private ListNode moveToNextHead(ListNode node, int nodeLength) {

        ListNode target = node;

        for(int i = 0 ; i <  nodeLength ; i++) {
            if(target == null) {
                break;
            }
            target = target.next;
        }

        if(target != null) {
            ListNode temp = target;
            target = target.next;
            temp.next = null;
        }

        return target;
    }
}