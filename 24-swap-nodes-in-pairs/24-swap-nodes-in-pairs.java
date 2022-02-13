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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        while(head!=null && head.next!=null){
            
            ListNode first = head;
            ListNode second = first.next;  
            ListNode newHead=second.next;   //saving the new head
        
            prev.next=second;
            second.next = first;
            first.next=newHead; 
            
            head = newHead;
            prev = first;
        }
        
        return dummy.next; //(how the dummy.next will still be pointing to the head?)
    }
}