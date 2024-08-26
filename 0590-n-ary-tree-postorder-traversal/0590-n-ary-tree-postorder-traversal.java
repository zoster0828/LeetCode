/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> result = new ArrayList();
    public List<Integer> postorder(Node root) {
        if(root == null) {
            return result;
        }
        
        for(Node node : root.children) {
            if(node.children.size() == 0) result.add(node.val);
            else {
                postorder(node);
            }
        }
        result.add(root.val);
        return result;
    }
}