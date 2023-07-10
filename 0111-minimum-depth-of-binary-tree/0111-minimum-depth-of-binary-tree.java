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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return getDepth(root,1);        
    }
    
    public int getDepth(TreeNode node, int depth) {
        if(hasNoChild(node)) {
            return depth;
        } else {
            if(node.left != null && node.right != null) {
                int f1 = getDepth(node.left, depth +1);
                int f2 = getDepth(node.right, depth +1);
                return Math.min(f1,f2);
            }else if(node.left != null){return getDepth(node.left, depth +1);}
            else{return getDepth(node.right, depth +1);}
            
            
        }
    }
    
    public boolean hasNoChild(TreeNode node) {
        if(node == null) return false;
        return node.left == null && node.right ==null;
    }
}