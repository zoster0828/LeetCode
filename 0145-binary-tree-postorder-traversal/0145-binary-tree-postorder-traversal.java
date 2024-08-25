/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (root == null)
            return res;
            
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        
        s1.push(root);
        
        while (!s1.isEmpty()) {
            TreeNode node = s1.pop();
            s2.push(node);
            
            if (node.left != null)
            s1.push(node.left);
            
            if (node.right != null)
            s1.push(node.right);
        }
        
        while (!s2.isEmpty())
            res.add(s2.pop().val);
        
        return res;
    }
}