class Solution {
    public int maxSubArray(int[] nums) {
        
         //implementing kadane's algorithm
        
        int maxSum=nums[0], currSum=nums[0], maxSumAtIndex=nums[0];
        for(int i=1;i<nums.length;i++){
			
            currSum+=nums[i];
            if(currSum>nums[i])
                maxSumAtIndex=currSum;
            else{
                maxSumAtIndex=currSum=nums[i];
            }
            maxSum=Math.max(maxSumAtIndex,maxSum);
        }
        return maxSum;
    }
}