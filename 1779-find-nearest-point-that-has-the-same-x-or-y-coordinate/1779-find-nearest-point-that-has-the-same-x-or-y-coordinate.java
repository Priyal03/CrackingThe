class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int size = points.length-1, md = 0, nearest = Integer.MAX_VALUE, smallestIndex = -1;
        
        for(int i=size;i>=0;i--){
            
            if(points[i][1]==y || points[i][0]==x){
                
                md = Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                
                if(md<=nearest){
                    nearest = md;
                    smallestIndex = i;
                }  
            }
        }
        
        return smallestIndex;
    }
}