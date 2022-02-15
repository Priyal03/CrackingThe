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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        int h = getHeight(head),  rem = h%k, size=0;
        int partition_size =(int) Math.ceil(h/k);
        ListNode arr[] = new ListNode[k];
        ListNode next = head, curr = head;
        
        for(int i=0;i<k;i++){
                
            ListNode first = new ListNode(0), temp=first;
            if(i<rem){
               size=partition_size +1;
            }else
                size=partition_size;
                
            
            for(int j=0;j<size;j++){
                
                temp.next = new ListNode(curr.val); //attaching a new node everytime.
                temp=temp.next;
                 
                if(curr!=null) //moving to next List element
                    curr=curr.next;
                
            }
            arr[i]=first.next;
        }
        return arr;
    }
    public int getHeight(ListNode node){
        
        int h=0;
        while(node!=null){
            h++;
            node=node.next;
        }
        return h;
    }
}