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
    int[] sort;
    public TreeNode sortedArrayToBST(int[] nums) {
        sort = nums;
        return balanceTreeGenerator(0, nums.length - 1);
    }

    private TreeNode balanceTreeGenerator(int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(sort[mid]);
        root.left = balanceTreeGenerator(start, mid - 1);
        root.right = balanceTreeGenerator(mid + 1, end);
        return root;
    }
}