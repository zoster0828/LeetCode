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
    List<TreeNode> sort = new ArrayList();
    public TreeNode balanceBST(TreeNode root) {
        treeSort(root);
        return balanceTreeGenerator(0, sort.size() - 1);
    }

    private void treeSort(TreeNode root) {
        if(root == null) return;
        treeSort(root.left);
        sort.add(root);
        treeSort(root.right);
    }

    private TreeNode balanceTreeGenerator(int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = sort.get(mid);
        root.left = balanceTreeGenerator(start, mid - 1);
        root.right = balanceTreeGenerator(mid + 1, end);
        return root;
    }
}