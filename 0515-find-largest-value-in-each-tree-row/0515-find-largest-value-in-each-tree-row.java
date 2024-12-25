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
    List<Integer> result = new ArrayList();
    public List<Integer> largestValues(TreeNode root) {        
        
        if(root == null) return result;

        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int num = Integer.MIN_VALUE;
            for(int i = 0 ; i < size ; i ++) {
                TreeNode node = queue.poll();
                num = Math.max(num, node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(num);
        }        

        return result;
    }
    
}