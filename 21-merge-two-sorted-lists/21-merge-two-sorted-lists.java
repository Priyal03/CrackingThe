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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      
        ListNode firstElement =  new ListNode(0);//dummy element
        ListNode head = firstElement; //we will attach the main list from pos(2)
        
        while(list1!=null && list2!=null){
            
            if(list1.val<=list2.val){
                head.next = list1;
                list1 = list1.next;
            }else{
               head.next = list2;
                list2 = list2.next; 
            }
            head=head.next; // assigning it to the curr element and making space for next iteration
        }
        
        if(list1!=null){
            head.next = list1;
        }
        
        if(list2!=null){
            head.next = list2;
        }
        
        return firstElement.next;
    }
}