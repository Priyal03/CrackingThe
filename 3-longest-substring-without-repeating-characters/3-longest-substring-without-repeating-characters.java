class Solution {
    //chotu
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> store = new HashSet<Character>();//to store the current window
        
        int left = 0, right = 0, n = s.length(), max=0;
        
        while(right<n){
           
            char curr = s.charAt(right);//take the next element
            
            while(store.contains(curr)){
                //if it contains the dup element, its time to shrink the window by increasing the left pointer.
                store.remove(s.charAt(left));
                left++;
            }
            
            store.add(curr);//finally add the curr element
            right++;//and increase the next pointer
            
            max = Math.max(store.size(), max);
        }
        
        return max;
    }
}