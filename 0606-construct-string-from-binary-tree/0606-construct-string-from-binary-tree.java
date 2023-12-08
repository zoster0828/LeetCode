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
    StringBuilder builder;
    public String tree2str(TreeNode root) {                        
        builder = new StringBuilder();
        draw(root);        
        return builder.toString();
    }
    
    void draw(TreeNode node) {
        builder.append(node.val);
        if(node.left != null) {
            builder.append("(");
            draw(node.left);
            builder.append(")");
        }
        
        if(node.right != null) {
            if(node.left == null) {
                builder.append("()");
            }
            builder.append("(");
            draw(node.right);
            builder.append(")");
        }
    }
}