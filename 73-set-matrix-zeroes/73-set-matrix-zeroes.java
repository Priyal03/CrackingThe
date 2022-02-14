class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean rowZero = false, colZero=false;
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                
                if(matrix[i][j]==0){
                    
                    if(i==0){
                        rowZero = true;
                    }
                    if(j==0)
                        colZero=true;
                    matrix[i][0]=0;  //marking on the left side to do that particular row
                    matrix[0][j]=0;  //marking on the top to mark later the column
                }
            }
        }
        
        //marking all the rows one by one.
        for(int i=1;i<matrix.length;i++){
            
            if(matrix[i][0]==0){
                
                for(int j=1;j<matrix[0].length;j++){
                
                    matrix[i][j]=0;
                }
            }
        }
        //marking all the columns one by one
        for(int i=1;i<matrix[0].length;i++){
            
            if(matrix[0][i]==0){
            
                for(int j=1;j<matrix.length;j++){
                
                    matrix[j][i]=0;
                }
            }
            
        }
        
        System.out.println(colZero+" "+rowZero);
        
        if(colZero){
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }
        
        if(rowZero){
            for(int i=0;i<matrix[0].length;i++)
                matrix[0][i]=0;
        }
    }
}