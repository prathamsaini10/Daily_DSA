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
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1)return head.next;
       
        delete(head,(int)Math.ceil(count/2));
        return head; 
    }

    public void delete(ListNode head,int index){
        
        ListNode prev=getNode(head,index-1); 
        prev.next=prev.next.next;
        
    }
      public ListNode getNode(ListNode head,int index) {
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}