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
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;

        ListNode newhead=reverse(head.next);
        ListNode front =head.next;
        front.next=head;
        head.next=null;
return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        // Stack<Integer> st = new Stack<>();
        // ListNode temp = head;
        // while (temp != null) {
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while (temp != null) {
        //     if (temp.val != st.peek()) {
        //         return false;
        //     }
        //     st.pop();
        //     temp = temp.next;
        // }
        // return true;

                //TORTOISE HARE
                   if(head == null || head.next==null )return true;
                
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        ListNode newhead =reverse(slow.next);

        ListNode last=newhead;
        ListNode first = head;
        while(last!=null){
            if(first.val!=last.val){
                reverse(newhead);
                return false;
            }
            first=first.next;
            last=last.next ;
            
        }
        reverse(newhead);
        return true;
    }
}