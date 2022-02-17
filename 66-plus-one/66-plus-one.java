class Solution {
    public int[] plusOne(int[] digits) {
        
        int n=digits.length, incr = digits[n-1]+1;
        n--;
        
        for(int i=n;i>=0;i--){
            
            digits[i]+=1; //plus one for every digit until u find 9
            
            if(digits[i]>9){
                
                digits[i]=0;  //for nine, keep adding one remainder 
            }else
                return digits;      //and return as soon as you update it.
            
        }
        //this case is for all the nines 
        digits=new int[n+2];
        digits[0]=1;
        
        return digits;
    }
}