class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<String>();
        generate(ans, new StringBuilder(),0,0,n);
        return ans;
        
    }
    
    public void generate(List<String> list,StringBuilder sb, int open, int close, int max){
        
        if(sb.length()==max*2){
            list.add(sb.toString());
            return;
        }
        
        if(open < max){
           sb.append("(") ;
            generate(list,sb,open+1,close,max);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(close<open){
            sb.append(")");
            generate(list,sb,open,close+1,max);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
}