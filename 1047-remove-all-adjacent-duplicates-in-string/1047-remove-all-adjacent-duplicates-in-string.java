class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        
        int len = -1, i=0;
        
        while(i<sb.length()-1 && i>=0){
            
            if(sb.charAt(i)==sb.charAt(i+1)){
                
                sb.delete(i,i+2);
                i--;
                if(i<0){
                    i=0;
                }
            }else
                i++;
        }
        
        return sb.toString();
    }
}