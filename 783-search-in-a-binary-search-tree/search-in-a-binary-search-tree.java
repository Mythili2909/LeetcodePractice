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
    public TreeNode searchBST(TreeNode root, int tar) {

        if(root==null)
        {
            return null;
        }
        if(root.val==tar )
        {
            return root;
        }
        if(tar<root.val)
        {
       return searchBST(root.left,tar); 

        }
       return searchBST(root.right,tar); 
    }
}