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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(queue.size()>0)
        {
            int n=queue.size();
            for(int i=0;i<n;i++)
            {
                TreeNode cur=queue.poll();
                if(cur.left!=null)
                {
                    queue.add(cur.left);
                }
                if(cur.right!=null)
                {
                    queue.add(cur.right);
                }
                if(i==n-1)
                {
                    res.add(cur.val);
                }
            }
        }
        return res;
    }
}