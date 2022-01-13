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
    ArrayList<Integer> result = new ArrayList<>(); 
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null){
            if(result.isEmpty()){
                return result;
            }
            return null;
        }
        
         
        if(root.left!=null){
            postorderTraversal(root.left);
        }
        
        
        if(root.right!=null){
            postorderTraversal(root.right);
        }
       
        
        result.add(root.val);
        
        return result;
    }
}