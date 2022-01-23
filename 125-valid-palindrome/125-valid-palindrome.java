class Solution {
    public boolean isPalindrome(String s) {
      
        s=s.toLowerCase();
        s= s.replaceAll("[^a-z0-9]","");
      
//         if(new StringBuilder(s).reverse().toString().equals(s))
//             return true;
        
//         return false;
        
        int first=0, last = s.length()-1;
        
        while(last>first){
            
            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
            last--;
            first++;
        }
        
        return true;
    }
}