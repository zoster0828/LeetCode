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
    Queue<TreeNode> queue = new LinkedList();
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        queue.add(root);
        return getDepth(1);
    }

    public int getDepth(int depth) {
        int size = queue.size();
        for(int i = 0 ; i < size ; i ++){
            TreeNode node = queue.poll();
            if(hasNoChild(node)) {
                return depth;
            } else {
                if(node.left !=null) {
                    queue.add(node.left);
                }
                if(node.right !=null) {
                    queue.add(node.right);
                }
            }
        }

        return getDepth(depth+1);
    }

    public boolean hasNoChild(TreeNode node) {
        if(node == null) return false;
        return node.left == null && node.right ==null;
    }
}