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
    int Ksmall;
    int counter;
    public int kthSmallest(TreeNode root, int k) {
         
          inOrder(root,k);
          return Ksmall;
    }

    void inOrder(TreeNode root,int k){
        if(root==null)return;
        inOrder(root.left,k);
        counter++;
        if(counter==k){
            Ksmall=root.val;
            return ;
        }
        inOrder(root.right,k);
    
    }
}