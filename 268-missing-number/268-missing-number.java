class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length, miss = n; //left most, 0 may not help in smallest arrays
        
        for(int i=0;i<n;i++){
            
            miss = miss ^ i ^ nums[i];
        }
        //XOR gives the sum of all the numbers without carry=& op
        //checkout all the bitwise uses.
        return miss;
    }
}