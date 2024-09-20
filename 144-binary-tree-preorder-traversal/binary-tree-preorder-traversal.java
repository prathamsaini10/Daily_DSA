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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list =new ArrayList<>();
        preOderHelper(root,list);
        return list;
     
    }

    public void preOderHelper(TreeNode root,List<Integer> list){
       
        if(root==null){
            return ;
        }
        list.add(root.val);
        preOderHelper(root.left,list);
    preOderHelper(root.right,list);
    }
}