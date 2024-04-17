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
    String result;
    public String smallestFromLeaf(TreeNode root) {        
        dfs(root, "");
        
        return result;
    }
    
    public void dfs(TreeNode root, String temp) {
        if(root == null) return;
        
        char c = (char) ('a' + root.val);
        temp = c + temp;
        
        
        
        if(root.left == null && root.right == null) {
            if(result == null) {
                result = temp;                          
            } else {
                if(result.compareTo(temp) > 0) {
                    result = temp;
                } else {
                    return;
                }
            }
        }
        
        dfs(root.left, temp);
        dfs(root.right, temp);
    }
}