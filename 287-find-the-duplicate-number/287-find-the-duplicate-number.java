class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> map = new HashSet<Integer>();
        
        for(int x : nums){
            
            if(map.contains(x)){
                return x;
            }
            map.add(x);
        
        }
        
        return 1;
    }
}