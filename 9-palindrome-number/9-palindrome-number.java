class Solution {

    //do a complete reverse and then compare it in O(n) times

    public boolean isPalindrome(int x) {
        
        if(x<0 || (x%10==0 && x!=0))
            return false;
        
        int rev = 0, num=x;
        
        while(num>rev){
            
            int curr = num%10;
            
            rev = rev*10+curr;
            
            num = num/10;
        }
        
        return ( num == rev || num== rev/10);
    
    }
}