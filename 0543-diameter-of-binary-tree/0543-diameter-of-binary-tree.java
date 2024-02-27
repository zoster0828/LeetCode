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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {        
        getDepth(root, 0);
        
        return max;
    }
    
    int getDepth(TreeNode node, int depth) {
        if(node == null) {return depth;}
        
        int left = getDepth(node.left, depth+1);
        int right = getDepth(node.right, depth+1);
        
        max = Math.max(left+right - ((depth+1) * 2), max);
        
        return Math.max(left, right);
    }
}