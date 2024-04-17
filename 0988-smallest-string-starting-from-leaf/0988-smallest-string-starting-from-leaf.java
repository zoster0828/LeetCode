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
    String list[] = new String[26];
    public String smallestFromLeaf(TreeNode root) {        
        dfs(root, "");
        
        for(int i = 0 ; i < 26 ; i++) {
            if(list[i] != null) {
                return list[i];
            }
        }
        
        return "";
    }
    
    public void dfs(TreeNode root, String result) {
        if(root == null) return;
        
        char c = (char) ('a' + root.val);
        result = c + result;
        
        if(root.left == null && root.right == null) {
            if(list[c-'a'] == null) {
                list[c-'a'] = result;
            } else {
                if(list[c-'a'].compareTo(result) > 0) {
                    list[c-'a'] = result;
                }
            }
        }
        
        dfs(root.left, result);
        dfs(root.right, result);
    }
}