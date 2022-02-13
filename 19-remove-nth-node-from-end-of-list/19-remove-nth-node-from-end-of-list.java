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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int h = getHeight(head);
        
        ListNode pointer=new ListNode(0);
        pointer.next = head;
        int nth = h-n+1;
        
        if(h==1 && n==1)
            return null; 
        
        ListNode temp=pointer;
        while(nth-->1)
            temp=temp.next;
        
        temp.next = temp.next.next;
        
        return pointer.next;
    }
    
    public int getHeight(ListNode head){
        
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}