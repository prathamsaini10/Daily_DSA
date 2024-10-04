/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,k,list);
        int l=0,r=list.size()-1;
        
        while(l<r){
            if((list.get(l)+list.get(r))==k)return true;

             if((list.get(l)+list.get(r))<k)l++;
              if((list.get(l)+list.get(r))>k)r--;

        }
        return false;
    }

    public void inOrder(TreeNode root,int k, List<Integer> list){
        if(root==null)return ;
        inOrder(root.left,k,list);
        list.add(root.val);
        inOrder(root.right,k,list);


    }
}