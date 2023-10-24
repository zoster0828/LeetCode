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
    Queue<TreeNode> queue;
    List<Integer> result;
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) {
            return new ArrayList();
        }
        queue = new LinkedList();
        result = new ArrayList();
        queue.add(root);
        bfs();
        
        return result;
    }
    
    public void bfs() {
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> temp = new LinkedList();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            max = Math.max(max, node.val);
            if(node.left!=null)
                temp.add(node.left);
            if(node.right!=null)
                temp.add(node.right);
        }
        result.add(max);
        
        queue.addAll(temp);
        if(queue.isEmpty()) {
            return;
        }
        bfs();
    }
}