class Solution {
    
    Map<Character,Integer> index = new HashMap<Character,Integer>();
        
    
    public boolean isAlienSorted(String[] words, String order) {
        
        char[] alpha = order.toCharArray();
        
        
        int x = 0;
        for(char c : alpha){
            index.put(c,++x);
        }
        
        for(int i=0;i<words.length-1;i++){
            
            String f = words[i];
            String s = words [i+1];
            
            if(!compare(f,s))
                return false;
            
        }
        return true;
    }
    public boolean compare(String f, String s){
            
            
            for(int j=0, k=0;k<f.length() && j<s.length();k++,j++){
            
               if(f.charAt(k)!=s.charAt(j)){
                    
                    if(index.get(f.charAt(k))>index.get(s.charAt(j))){
                
                        return false;
                    }else{
                
                        return true;
                    }
                }
            
            }
            if(f.length()>s.length())
                return false;
         
        return true;
    }
}