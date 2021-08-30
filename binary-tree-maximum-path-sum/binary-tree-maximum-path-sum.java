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
    
    int max=-Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        maxGain(root);
        return max;
    }
    public int maxGain(TreeNode root) {
        if(root==null)
            return 0;
        
        max=Math.max(root.val,max);
        
        if(root.left==null && root.right==null)
            return root.val;
        
        
        int left=Math.max(maxGain(root.left),0);
        int right=Math.max(maxGain(root.right),0);
        
        int now = root.val+left+right;
        
        max=Math.max(now,max);
        
        return root.val+Math.max(left,right);
        
    }
}