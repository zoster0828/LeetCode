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
    String result = "";
    public String tree2str(TreeNode root) {                        
        draw(root);        
        return result;
    }
    
    void draw(TreeNode node) {
        result += node.val;
        if(node.left != null) {
            result += "(";
            draw(node.left);
            result += ")";
        }
        
        if(node.right != null) {
            if(node.left == null) {
                result += "()";
            }
            result += "(";
            draw(node.right);
            result += ")";
        }
    }
}