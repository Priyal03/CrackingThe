/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        
        int buffer = 4, copyIndex=0 ;
        
        char buf4[] = new char[4];
        
        while(copyIndex<n && buffer == 4 ){
            
           buffer =  read4(buf4);
            
            for(int i=0;i<buffer;i++){
                
                if(copyIndex == n)
                    return copyIndex;
                
                buf[copyIndex]=buf4[i]; //copy it again to the same space.
                copyIndex++;
            }
        }
        
        return copyIndex;
    }
}