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
    Queue<TreeNode> q = new LinkedList();
    List<String> list = new ArrayList();
    int result = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) {return 0;}
        
        bfs("", root);
    
        
        return result;
    } 
    
    public void bfs(String value, TreeNode root) {
        String v = value + root.val;        
        
        if(root.left == null && root.right == null) result += Integer.parseInt(v);
        
        if(root.left != null) {
            bfs(v, root.left);
        }
        
        if(root.right != null) {
            bfs(v, root.right);
        }
    }
}