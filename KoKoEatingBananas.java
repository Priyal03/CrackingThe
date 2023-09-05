class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left=1, right = 1;//minimum speed as left, max speed as right
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        
        while(left<right){
            
            int mid=(left+right)/2;
            int totalHours=0;
            
            for(int pile:piles){
                totalHours += Math.ceil((double)pile/mid);
            }
            
            if(totalHours<=h){
                right=mid;
            }else
                left=mid+1;   
        }
        return right;
    }
}
