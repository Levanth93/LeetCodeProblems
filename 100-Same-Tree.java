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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        isSame(p,l1);
        isSame(q,l2);

        return l1.equals(l2);
    }
    public void isSame(TreeNode node,List<Integer> list){
        if(node==null){
            list.add(null);
            return;
        }
        list.add(node.val);

        isSame(node.left,list);
        isSame(node.right,list);
    }
}