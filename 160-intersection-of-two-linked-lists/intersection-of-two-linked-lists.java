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
        // HashMap<ListNode,Integer> map=new HashMap<>();
        // ListNode temp=headA;
        // while(temp!=null){
        //     map.put(temp,1);

        //     temp=temp.next;
        // }
        // temp=headB;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return temp;
        //     }
        //     temp=temp.next;
        // }
        // return null;

            int n1=0,n2=0;
            ListNode temp1=headA,temp2=headB;
            while(temp1!=null){
                n1++;
                temp1=temp1.next;

            }
              while(temp2!=null){
                n2++;
                temp2=temp2.next;
                
            }
            int a=0;
            temp1=headA;
            temp2=headB;
            if(n1>n2){
                
                a=n1-n2;
                 while(a>0){
             temp1=temp1.next;
             a--;   
            }
            }else if(n2>n1){
                a=n2-n1;
                 while(a>0){
             temp2=temp2.next;
             a--;   
            }
            }
           while(temp1!=null&&temp2!=null){
            if(temp1==temp2)return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
           }
           return null;
    }
}