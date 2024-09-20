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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> list =new ArrayList<>();
         Queue<TreeNode> queue=new LinkedList<TreeNode>();
         if(root==null)return list;
         queue.offer(root);
         while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                sub.add(queue.poll().val);
            }
            list.add(sub);
                     }
        return list;
    }
}