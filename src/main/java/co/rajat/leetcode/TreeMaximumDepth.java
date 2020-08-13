package co.rajat.leetcode;

import co.rajat.leetcode.common.TreeNode;

/**
 * Leetcode Problem #104
 * Difficulty: Easy
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class TreeMaximumDepth {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));

    }

}
