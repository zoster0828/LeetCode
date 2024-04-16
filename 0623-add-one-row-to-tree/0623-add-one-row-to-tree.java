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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {        
        if(root == null) {return root;}
        if(depth == 1) {
            root = new TreeNode(val, root, null);
            return root;
        }
        
        q.add(root);
        
        int height = 1;
        while(!q.isEmpty()) {
            if(height == depth-1) {
                int length = q.size();
                for(int i = 0 ; i < length ; i++) {
                    TreeNode node = q.poll();
                    if(node == null) continue;
                    
                    node.left = new TreeNode(val, node.left, null);
                    node.right = new TreeNode(val, null, node.right);
                }
                
                break;
            } else {                
                int length = q.size();
                for(int i = 0 ; i < length ; i++) {
                    TreeNode node = q.poll();
                    if(node == null) continue;
                    
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            height++;
        }
        
        return root;
    }
}