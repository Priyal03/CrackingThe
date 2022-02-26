class Solution {
    private double max = 0;
    public double maximumAverageSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        traverse(root);
        return max;
    }
    
    private int traverse(TreeNode root) {
        if (root == null) {
            return -1;
        }
        
        int left = traverse(root.left);
        int right = traverse(root.right);
        int curr = 0;
        int currSum = 0;
        if (left != -1) {
            curr++;
            currSum += left;
        }
        
        if (right != -1) {
            curr++;
            currSum += right;
        }
        
        double value = (currSum + root.val)/ (double)(curr + 1);
       // System.out.println(value);
        max = Math.max(value, max);
        
        return (int)value;
        
    }
}