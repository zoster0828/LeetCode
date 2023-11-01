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
    Map<Integer, Integer> map;
    public int[] findMode(TreeNode root) {
        queue = new LinkedList();
        map = new HashMap();
        queue.add(root);
        dfs();
        
        int max = 0;
        List<Integer> result = new ArrayList();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                result.add(entry.getKey());
            } else if(entry.getValue() > max) {
                result.clear();
                result.add(entry.getKey());
                max = entry.getValue();
            } else {
                continue;
            }
        }
        
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    
    void dfs() {
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node == null) {
                continue;
            }
            map.put(node.val, map.getOrDefault(node.val, 0)+1);
            queue.add(node.left);
            queue.add(node.right);
        }
    }
    
}