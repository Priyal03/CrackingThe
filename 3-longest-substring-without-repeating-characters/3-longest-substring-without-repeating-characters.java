class Solution {
    //chotu
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> store = new HashMap<Character,Integer>();//to store the current window
        
        int left = 0, right = 0, n = s.length(), max=0;
        
        while(right<n){
           
            char curr = s.charAt(right);//take the next element
            
            if(store.containsKey(curr)){
                //if it contains the dup element, its time to shrink the window by increasing the left pointer.
                
                left = Math.max(store.get(curr),left);
            }
            //\U0001f495\U0001f60a☺️\U0001f602❤️\U0001f60f\U0001f60d
            
            max = Math.max(right-left+1, max);
            
            store.put(curr,right+1);//finally add the curr element
            right++;//and increase the next pointer
            
        }
        
        return max;
    }
}