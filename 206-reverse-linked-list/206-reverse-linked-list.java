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
    public ListNode reverseList(ListNode head) {
        
        ListNode temp=head, curr=head, prev=null,next=head;
        
        while(curr!=null){
            
            temp = curr; //storing the curr pointer
            next = curr.next; //storing the next pointer
            curr.next = prev; //reversing the link here
            prev = temp; //moving the pointer next
            curr = next; //moving the pointer next
            
        }
        return prev;
    }
}