class Solution {
    private int maxZigZag = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        dfs(root, true, 0);
        dfs(root, false, 0);
        
        return maxZigZag;
    }

    private void dfs(TreeNode node, boolean isLeftDirection, int length) {
        if (node == null) {
            return;
        }
        
        // Update the maximum ZigZag length
        maxZigZag = Math.max(maxZigZag, length);

        if (isLeftDirection) {
            // Move to the left, and then to the right
            dfs(node.left, false, length + 1);
            dfs(node.right, true, 1);  // Start a new ZigZag from the right child
        } else {
            // Move to the right, and then to the left
            dfs(node.right, true, length + 1);
            dfs(node.left, false, 1);  // Start a new ZigZag from the left child
        }
    }
}
