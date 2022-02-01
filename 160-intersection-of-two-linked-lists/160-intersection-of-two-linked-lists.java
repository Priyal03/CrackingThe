/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode nodeB = headB;
        
        while(headA!=null){
            
            
            while(headB!=null){
                
                if(headA==headB){
                    
                    return headA;
                    
                }
                headB=headB.next;
            }
            headB = nodeB;
            headA = headA.next;
        }
        
        return null;
    }
}

