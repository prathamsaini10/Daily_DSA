/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
                //HashMap
        // HashMap<ListNode,Integer> map=new HashMap<>(0);
        // ListNode temp=head;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return true;
        //     }
        //     map.put(temp,1);
        //     temp=temp.next;
        // }
        // return false;

                //TORTOISE AND HARE METHOD
        ListNode slow=head;
        ListNode fast =head;
        if(head==null||head.next==null||head.next.next==null)return false;
        while(fast != null && fast.next != null){
           fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){return true;}
        }
        return false;
    }
}