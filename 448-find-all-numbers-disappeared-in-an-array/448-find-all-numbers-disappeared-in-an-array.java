class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new LinkedList<Integer>(); //store the answer here
        int n=nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();//save the occurrances here. because map has O(1) access time.
        
        while(n-->0)
            map.put(nums[n],1);
        
        n=nums.length+1;
        
        for(int i=1;i<n;i++){
           
            if(map.get(i)==null){
                list.add(i);
            }
        }
        
        return list;
    }
}