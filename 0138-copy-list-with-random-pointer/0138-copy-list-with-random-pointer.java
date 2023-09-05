/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap();
        Node iter = head;
        while(iter != null) {
            map.put(iter, new Node(iter.val));
            iter = iter.next;
        }
        
        iter = head;
        Node result = null;
        Node target = null;
        while(iter != null) {
            target = map.get(iter);
            if(result == null) {
                result = target;
            }
            
            target.next = map.get(iter.next);
            target.random = map.get(iter.random);
            iter = iter.next;
        }
            
        return result;
    }
}