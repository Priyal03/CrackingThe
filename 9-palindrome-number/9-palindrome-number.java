class Solution {
    //do a complete reverse and then compare it in O(n) times
    //
    public boolean isPalindrome(int x) {
        
        if(x>=0){
            
            String first = String.valueOf(x);
            StringBuilder sb = new StringBuilder(first).reverse(); 
            String two = sb.toString();
            
            
            return two.equalsIgnoreCase(first);
        }
        return false;
    }
}