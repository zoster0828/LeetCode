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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;
        remove(root, target);
        
        if(root.val == target && root.left == null && root.right == null) {
            root = null;
        }
        
        return root;
    }
    
    boolean remove(TreeNode root, int target) {
        if(root == null) return true;
        
        boolean doneleft = remove(root.left, target);
        boolean doneright = remove(root.right, target);
        if(doneleft) root.left = null;
        if(doneright) root.right = null;
        
        if(root.val == target && root.left == null && root.right == null) {
            return true;
        }
        
        return false;
    }
}