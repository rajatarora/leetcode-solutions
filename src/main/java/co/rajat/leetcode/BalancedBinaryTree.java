package co.rajat.leetcode;

import co.rajat.leetcode.common.TreeNode;

/**
 * Leetcode Problem #110
 * Difficulty: Easy
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 &&
                isBalanced(root.left) &&
                isBalanced(root.right);

    }

    private int height(TreeNode node) {

        if (node == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));

    }

}




