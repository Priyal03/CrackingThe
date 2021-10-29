class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                
                if(find(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean find(char[][] board, String word, int x,int i,int j){
        
        if(word.length()==x)
            return true;
        
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || word.length()<x || board[i][j]!=word.charAt(x))
           return false;
       
        board[i][j]='*';
        
        boolean flag=  (//find(board,word,x+1,i+1,j+1) ||
        find(board,word,x+1,i-1,j) ||
      //  find(board,word,x+1,i-1,j-1) || 
                      //  find(board,word,x+1,i+1,j-1) || 
        find(board,word,x+1,i,j-1) ||
        find(board,word,x+1,i,j+1) ||
                 //      find(board,word,x+1,i-1,j+1) || 
        find(board,word,x+1,i+1,j));
         
        board[i][j] = word.charAt(x);
        
        return flag;
    }
}