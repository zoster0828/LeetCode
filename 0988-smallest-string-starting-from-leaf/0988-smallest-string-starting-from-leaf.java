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
        int depth = getDepth(root, 0);
        dfs(root, new char[depth], depth-1);
        
        return result;
    }
    
    public int getDepth(TreeNode root, int curr) {
        if(root == null) return 0;
        
        return Math.max(getDepth(root.left, curr), getDepth(root.right, curr)) +1;
    }
    
    public void dfs(TreeNode root, char[] temp, int depth) {
        if(root == null) return;
        
        char c = (char) ('a' + root.val);
        temp[depth] = c;
        
        
        
        if(root.left == null && root.right == null) {
            String candid = new String(temp, depth, temp.length-depth);
            if(result == null) {
                result = candid;                          
            } else {
                if(result.compareTo(candid) > 0) {
                    result = candid;
                } else {
                    return;
                }
            }
        }
        
        dfs(root.left, temp, depth-1);
        dfs(root.right, temp, depth-1);
    }
}