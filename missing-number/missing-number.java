class Solution {
    public int missingNumber(int[] nums) {
        
        int sum=nums[0], n=nums.length;
        for(int i=1;i<n;i++){
		    sum+=nums[i];
        }
        int seriesSum = n*(n+1)/2;
        
        return seriesSum - sum;
        
    }
}