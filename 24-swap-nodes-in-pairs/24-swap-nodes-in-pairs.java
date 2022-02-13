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
        
        ListNode first = head;
        
        if(head==null || head.next==null){
            return head;   
        }
        
        ListNode second = first.next;  
        ListNode newHead=second.next;   //saving the new head
        
        head = second;
        first.next=swapPairs(newHead); //uses of recursion over here. 
        head.next = first;
        
        return head;
    }
}