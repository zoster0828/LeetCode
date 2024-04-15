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
    Queue<TreeNode> q = new LinkedList();
    List<String> list = new ArrayList();
    
    public int sumNumbers(TreeNode root) {
        if(root == null) {return 0;}
        
        bfs("", root);
    
        
        int result = 0;
        for(int i = list.size() - 1 ; i >= 0 ; i--) {
            result += Integer.parseInt(list.get(i));
        }
        
        return result;
    } 
    
    public void bfs(String value, TreeNode root) {
        String v = value +""+ root.val;        
        
        if(root.left == null && root.right == null) list.add(v);
        
        if(root.left != null) {
            bfs(v, root.left);
        }
        
        if(root.right != null) {
            bfs(v, root.right);
        }
    }
}