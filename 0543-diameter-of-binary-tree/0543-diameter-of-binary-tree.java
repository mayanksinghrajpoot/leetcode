class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        // Recursively find the height of left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // The diameter at this node is left height + right height
        // Update the global maximum if this path is longer
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return the height of this node to the parent
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
