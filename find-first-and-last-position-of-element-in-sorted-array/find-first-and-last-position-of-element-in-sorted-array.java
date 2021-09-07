class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=-1, last=-1;
        boolean foundF = false, foundS=false;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==target){
                
                if(foundF){
                    last=i;
                    //foundS=true;
                    //break;
                }else{
                    first = i;
                    last=i;
                    foundF=true;
                }
            }
        }
      //  if(foundF && )
        return new int[]{first,last};
    }
}