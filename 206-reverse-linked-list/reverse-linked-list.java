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
                    //USING STACK
        // ListNode temp = head;       
        // Stack<Integer> stack = new Stack<>();  
        // while (temp != null) {
    
        //     stack.push(temp.val); 
            
        //     temp = temp.next;      
        // }

        // temp = head;  
        // while (temp != null) {
           
        //     temp.val = stack.pop();  
           
        //     temp = temp.next;         
        // }
        
        // return head;     

        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;

        }
        head=prev;
        return head;
    }
}