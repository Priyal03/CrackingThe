class Solution {
    public void moveZeroes(int[] nums) {
        
        int index=0;
        //one pass for moving the integers on left side.
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0){
                
                nums[index]=nums[i];
                index++;
            }
        }
        
        //one pass for trailing zeroes
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }
}