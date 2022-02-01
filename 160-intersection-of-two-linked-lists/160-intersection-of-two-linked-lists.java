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
        
        ListNode res = null; 
        ListNode nodeB = headB;
        
        while(headA!=null){
            
            headB = nodeB;
            while(headB!=null){
                
                if(headA==headB){
                    
                    return headA;
                    
                }
                headB=headB.next;
            }
            
            headA = headA.next;
        }
        
        return res;
    }
}

