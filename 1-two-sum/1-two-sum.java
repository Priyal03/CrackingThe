class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> secondElement = new HashMap<Integer,Integer>();
        int n=nums.length;
       
        for(int i=0;i<n;i++){
            
            int second = target-nums[i];
            
            if(secondElement.containsKey(second))
                return new int[]{secondElement.get(second),i};
                
            secondElement.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}