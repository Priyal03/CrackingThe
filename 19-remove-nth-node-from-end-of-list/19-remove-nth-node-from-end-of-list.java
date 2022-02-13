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
        
        ListNode first=new ListNode(0);
        first.next = head;
        
        ListNode pointer1=first;
        ListNode pointer2=first;
        
        while(n-->0){
            pointer1=pointer1.next;
        }
        
        while(pointer1.next!=null){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        pointer2.next=pointer2.next.next;
        
        return first.next;
    }
}