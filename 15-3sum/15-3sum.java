class Solution {
   
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> firstNum = new HashSet<>();
        
        for (int i = 0; i < nums.length - 2; i++){
            
            if (!firstNum.contains(nums[i])) {
                
                int sum = -nums[i];
                Set<Integer> secondNum = new HashSet<>();
                Set<Integer> thirdNum = new HashSet<>();
                
                for (int j = i + 1; j < nums.length; j++){
                    
                    if (!firstNum.contains(nums[j]) && !thirdNum.contains(nums[j])){ //both sets dont contain
                        
                        if (secondNum.contains(sum - nums[j])){ //if second also do not contain then.. we found the match
                            res.add(Arrays.asList(nums[i], nums[j], sum - nums[j])); //and add it to result
                            thirdNum.add(nums[j]);
                        }
                        else{
                            secondNum.add(nums[j]); //add it to second Set.
                        }
                    }
                }
                firstNum.add(nums[i]); //add all the elements to firstNum Set ; should not be duplicate Hence, HashSet.
            }
        }
        return res;
    } 
}