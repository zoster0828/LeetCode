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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap();
        Map<Integer, TreeNode> parentMap = new HashMap();

        for(int i = 0 ; i < descriptions.length ; i++) {
            int isLeft = descriptions[i][2];            
            TreeNode parent = null;
            if(map.containsKey(descriptions[i][0])) {
                parent = map.get(descriptions[i][0]);
            } else {
                parent = new TreeNode(descriptions[i][0]);
                map.put(parent.val, parent);
            }

            TreeNode child = null;
            if(map.containsKey(descriptions[i][1])) {
                child = map.get(descriptions[i][1]);
            } else {
                child = new TreeNode(descriptions[i][1]);
                map.put(child.val, child);
            }
            
            parentMap.put(child.val, parent);
            if(isLeft==1) parent.left = child;
            else parent.right = child;
        }
        
        TreeNode result = parentMap.get(descriptions[0][1]);
        while(parentMap.get(result.val) != null) {
            result = parentMap.get(result.val);
        }

        return result;
    }
}