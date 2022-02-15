/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getHeight(ListNode node){
        int h=0;
        while(node!=null){
            h++;
            node=node.next;
        }
        return h;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int h1=getHeight(l1), h2=getHeight(l2);
        
        if(h1>=h2){
          //  System.out.println("case1");
                
           return add(l1,l2);
        }else
           return add(l2,l1);
        
    }
    
    public ListNode add(ListNode lon, ListNode shor) {
        
        int rem=0; ListNode head = lon;
      //  System.out.println(lon+" "+shor);
        while(shor!=null){
            
            int sum = rem+lon.val+shor.val;
            lon.val = sum%10;
            
            if(sum>9)
                rem = sum/10;
            else
                rem=0;
            
            if(rem!=0 && lon.next==null){
                ListNode node = new ListNode(rem);
                lon.next=node;
                rem = rem/10;
            }
            
            shor=shor.next;
            lon = lon.next;
        }
        
        while(lon!=null){
            
            int sum = rem+lon.val;
            lon.val = sum%10;
            
            if(sum>9)
                rem = sum/10;
            else
                rem=0;
            
            if(rem!=0 && lon.next==null){
                ListNode node = new ListNode(rem);
                lon.next=node;
                rem = rem/10;
            }
            lon = lon.next;
        }
        
        
        
        return head;
    }
}