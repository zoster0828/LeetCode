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
    List<Integer> lv = new ArrayList();
    public boolean isEvenOddTree(TreeNode root) {
        queue.add(root);        
        return bfs(false, 1);
    }
    public boolean bfs(boolean even, int count) {
        int next = 0;
        List<Integer> now = new ArrayList();
        while(count > 0){
            count--;
            TreeNode node = queue.poll();
            if(even) {
                if(node.val % 2 != 0) return false;
            } else {
                if(node.val % 2 != 1) return false;
            }
            now.add(node.val);
            if(node != null){
                if(node.left != null) {
                    queue.add(node.left);
                    next++;
                }
                
                if(node.right != null) {
                    queue.add(node.right);
                    next++;
                }
            }            
        }
        if(even) {            
            int curr = Integer.MAX_VALUE;
            for(int i = 0 ; i < now.size() ; i++) {
                if(curr > now.get(i)) {
                    curr = now.get(i);
                } else {
                    return false;
                }
            }
        } else {
            int curr = Integer.MIN_VALUE;
            for(int i = 0 ; i < now.size() ; i++) {
                if(curr < now.get(i)) {
                    curr = now.get(i);
                } else {
                    return false;
                }
            }
        }
        if(queue.isEmpty()) {
            return true;
        } else {
            return bfs(!even, next);
        }
    }
}