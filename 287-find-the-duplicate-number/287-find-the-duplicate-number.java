class Solution {
    public int findDuplicate(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int x : nums){
            
            if(map.containsKey(x)){
                return x;
            }
            map.put(x,1);
        
        }
        
        return 1;
    }
}