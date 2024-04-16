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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {        
        if(depth == 1) {
            root = new TreeNode(val, root, null);
            return root;
        }
        
        dfs(root, val, depth, 1);
        
        return root;
    }
    
    public void dfs(TreeNode root, int val, int depth, int curr) {
        if(root == null) return;
        
        if(curr == depth - 1) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
            return;
        } else {
            dfs(root.left, val, depth, curr+1);
            dfs(root.right, val, depth, curr+1);
        }
    }
}