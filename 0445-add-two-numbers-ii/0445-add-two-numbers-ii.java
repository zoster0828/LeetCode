

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> first = nodeToStack(l1);
        Stack<Integer> second = nodeToStack(l2);
        
        int over = 0;        
        ListNode result = null;
        while(!first.isEmpty() || !second.isEmpty()) {
            int sum = 0;
            sum += first.isEmpty() ? 0 : first.pop();
            sum += second.isEmpty() ? 0 : second.pop();
            sum += over;
            
            if(sum > 9) {
                sum = sum % 10;
                over = 1;
            } else {
                over = 0;
            }
            
            //add prev node
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
    
    Stack<Integer> nodeToStack(ListNode node) {
        Stack<Integer> stack = new Stack();
        while(node!=null) {
            stack.add(node.val);
            node = node.next;
        }
        
        return stack;
    }
}
