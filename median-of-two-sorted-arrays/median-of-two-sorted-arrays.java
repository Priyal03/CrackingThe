class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        int l1=nums1.length, l2=nums2.length,l=0;
        boolean first = false;
        int count =l1+l2, sum=0;
        int arr[]=new int[count];
        
        int p1=0,p2=l1,p3=0,p4=l2, left=0,next=0, prev=0,i=0;
        
        double med=0;
        if(count<2){
            if(l1==0)
                return nums2[0];
            else
                return nums1[0];
        }
        while(p2>p1 && p3<p4){
            
            next=prev;
            if(nums1[p1]<nums2[p3]){
                prev=nums1[p1];
                
                left++;
                p1++;
               // next=nums1[p1];
            }else if(nums1[p1]==nums2[p3]){
                prev=nums1[p1];
                p1++;
                p3++;
                left+=2;
                arr[i]=prev; i++;
               //  next=nums1[p1];
            }else{
                prev=nums2[p3];
                p3++;
                left++;
             //    next=nums2[p3];
            }
            arr[i]=prev;
           i++;
            if((left*2)>count){
               
               break;
            }
            
        }
        if(p1==p2){
        while(p3<p4){
            next=prev;
           prev= nums2[p3];
           p3++;
           left++; 
           arr[i]=prev;
           i++;
           
             if((left*2)>count){
                med= prev;
                break;
            }
        }
            
        }
        
        if(p3==p4){
            while(p1<p2){
                next=prev;
                prev=nums1[p1];
                p1++;
                left++;
                arr[i]=prev;
                i++;  
           
            if((left*2)>count){
                med= prev;
                break;
            }
            }
        }
        int half = count/2;
        if(count%2==0){
           
            med=(double)((arr[half]+arr[half-1])/2.0);
            //System.out.println("here "+prev+" "+next);
        }else
            
            med = arr[half];
        
        
        return med;
    
    }
}