

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> first = new Stack();
        Stack<Integer> second = new Stack();
        
        while(l1!=null) {
            first.add(l1.val);
            l1 = l1.next;
        }
        
        while(l2!=null) {
            second.add(l2.val);
            l2 = l2.next;
        }
        
        int over = 0;        
        ListNode result = null;
        while(!first.isEmpty() || !second.isEmpty()) {
            int sum = 0;
            if(!first.isEmpty()) {
                sum += first.pop();
            }
            if(!second.isEmpty()) {
                sum += second.pop();
            }
            sum += over;
            if(sum > 9) {
                sum = sum % 10;
                over = 1;
            } else {
                over = 0;
            }
            
            if(result == null) {
                result = new ListNode(sum);
            } else {
                ListNode temp = new ListNode(sum, result);              
                result = temp;
            }
        }
        
        if(over == 1) {
            ListNode temp = new ListNode(1, result);              
            result = temp;
        }
        
        return result;
    }   
}
