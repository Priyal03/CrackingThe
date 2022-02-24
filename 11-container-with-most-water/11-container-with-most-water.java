class Solution {
    public int maxArea(int[] height) {
        
        int area = 0, left = 0, right = height.length-1;
        
        while(left<right){
            
            int currArea = Math.min(height[left],height[right])*(right-left); //area = l*b
            
            area = Math.max(area,currArea);
            
            if(height[left]<height[right]){ //whichever is less in value; try to increase that to make max area in the next run
                
                left++;
            }else
                right--;
        }
        
        return area;
    }
}