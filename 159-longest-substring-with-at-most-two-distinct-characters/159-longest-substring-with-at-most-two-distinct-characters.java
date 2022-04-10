class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        
        int n = s.length(), maxLen = 2, left=0, right=0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        if(n<3)
            return n;
        //traverse till right is not end
        while(right<n){
            
            //put every character's right most index
            map.put(s.charAt(right), right++);
            
            //limit the map size to only 3 
            if(map.size()==3){
                
                //delete the least minimum index 
                int delIndex = Collections.min(map.values());
                
                map.remove(s.charAt(delIndex)); //remove the entry from map to limit the size.
                
                left = delIndex + 1;
            }
            
            maxLen = Math.max(maxLen, right-left);//compare and get the max len
        }
        return maxLen;
    }
}