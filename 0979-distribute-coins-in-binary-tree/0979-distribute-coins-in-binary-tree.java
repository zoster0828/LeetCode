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
    int moves = 0;

    public int distributeCoins(TreeNode root) {
        find(root);
        return moves;
    }

    private int find(TreeNode node) {
        if (node == null) return 0;

        int left = find(node.left);
        int right = find(node.right);

        moves += Math.abs(left) + Math.abs(right);

        return node.val + left + right - 1;
    }
}