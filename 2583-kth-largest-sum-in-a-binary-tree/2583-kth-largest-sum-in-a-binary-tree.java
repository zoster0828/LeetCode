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
    PriorityQueue<Long> pq = new PriorityQueue(Collections.reverseOrder());    
    public long kthLargestLevelSum(TreeNode root, int k) {
        queue.add(root);
        dfs();        

        if(pq.size() < k) return -1;
        long result = 0;
        for(int i = 0 ; i < k ; i++) {
            result = pq.poll();
        }

        return result;
    }

    private void dfs() {        
        while(!queue.isEmpty()) {
            int n = queue.size();            
            Long temp = 0L;
            for(int i = 0 ; i < n ; i++) {
                TreeNode node = queue.poll();
                temp += node.val;                

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            pq.add(temp);                  
        }
    }
}