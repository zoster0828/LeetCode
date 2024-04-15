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
    public int sumNumbers(TreeNode root) {
        if(root == null) {return 0;}
        
        return bfs(root, 0);    
    } 
    
    public int bfs(TreeNode root, int result) {      
        if(root == null) return 0;
        
        int value = result*10 + root.val;
        if(root.left == null && root.right == null) {
            return value;
        }
        
        return bfs(root.left, value) + bfs(root.right, value);
    }
}