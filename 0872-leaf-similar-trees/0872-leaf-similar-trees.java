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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList();
        List<Integer> result2 = new ArrayList();

        recursive(root1, result1);
        recursive(root2, result2);

        if(result1.size() != result2.size()) return false;

        for(int i = 0 ; i < result1.size() ; i++) {
            if(result1.get(i) != result2.get(i)) return false;
        }

        return true;
    }

    private void recursive(TreeNode root1, List<Integer> result1) {
        if(root1 == null) return;

        if(isLeaf(root1)) {
            result1.add(root1.val);
        } else {
            recursive(root1.left, result1);
            recursive(root1.right, result1);
        }
    }

    boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}