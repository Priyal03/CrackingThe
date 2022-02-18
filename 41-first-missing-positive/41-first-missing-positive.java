class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int count=0;
        LinkedHashSet<Integer> set = IntStream.of(nums).boxed().sorted().collect(Collectors.toCollection(LinkedHashSet::new)); //taking extra space.
        //also sorted() internally calls Arrays.sort() which takes nlogn time and stream API uses timsort 
        
        for(int x : set){
            //System.out.println(x);
            if(x>0){
                count++;
                if(count!=x)
                    return count;
            }
        }
        
//         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//         for(int i=1;i<n;i++){
           
//             map.putIfAbsent(nums[i],1);
//             map.putIfPresent(nums[i],map.get(nums[i]))
            
//         }
        

//         Arrays.sort(nums);
//         for(int x : nums){
            
//             if(x>0){
//                 count++;
//                 if(count!=x)
//                     return count;
//             }
//         }
        return count+1;
    }
}