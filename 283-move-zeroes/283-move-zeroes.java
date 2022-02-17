class Solution {
    public void moveZeroes(int[] nums) {
        
        int index=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0){
                
                int temp = nums[index];
                
                nums[index]=nums[i]; //moving the non zero element on the left most side
               
                nums[i]=temp;  //why cant we marking the curr empty element zero?? why to swap ?? 
                
                index++;
            }
        }
       
    }
}