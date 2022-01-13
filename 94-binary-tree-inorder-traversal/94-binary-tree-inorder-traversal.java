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
    List<Integer> lists = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root==null){
            if(lists.isEmpty()){
                return lists;
            }
            return null;
        }
        
        if(root.left!=null)
            inorderTraversal(root.left);
        lists.add(root.val);
        if(root.right!=null)
            inorderTraversal(root.right);
        
        return lists;
    }
}