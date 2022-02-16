class Solution {
    //one pass solution O(n) time and O(1) space
    public int maxProfit(int[] prices) {
        
        int low=prices[0], max=0;
        
        for(int i=1;i<prices.length;i++){
            
            if(low>prices[i]){
                
                low = prices[i];//save the lower value
            }
            int diff = prices[i]-low; // take the differece at each step 
            if(max<diff){  //keep trace of the maximum profit in this variable at each step
                max = diff;
            }
        }
        
        return max;
    }
}