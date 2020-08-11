package co.rajat.leetcode;

import co.rajat.leetcode.common.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {

    private final BalancedBinaryTree objectUnderTest = new BalancedBinaryTree();

    @Test
    public void isBalanced_nullNode() {
        boolean result = objectUnderTest.isBalanced(new TreeNode());
        assertThat(result, is(true));
    }

    @Test
    public void isBalanced_singleNode() {
        boolean result = objectUnderTest.isBalanced(new TreeNode(5));
        assertThat(result, is(true));
    }

    @Test
    public void isBalanced_fullBinaryTree() {
        boolean result = objectUnderTest.isBalanced(
                new TreeNode(5,
                new TreeNode(6,
                        new TreeNode(7),
                        new TreeNode(8)),
                new TreeNode(9,
                        new TreeNode(10),
                        new TreeNode(11))));
        assertThat(result, is(true));
    }

    @Test
    public void isBalanced_balancedTree() {
        boolean result = objectUnderTest.isBalanced(
                new TreeNode(5,
                new TreeNode(6,
                        new TreeNode(7),
                        new TreeNode(8)),
                new TreeNode(9,
                        new TreeNode(10),
                        new TreeNode(11,
                                new TreeNode(12),
                                null))));
        assertThat(result, is(true));
    }

    @Test
    public void isBalanced_unbalancedTree() {
        boolean result = objectUnderTest.isBalanced(
                new TreeNode(5,
                new TreeNode(6,
                        new TreeNode(7),
                        new TreeNode(8)),
                new TreeNode(9,
                        new TreeNode(10),
                        new TreeNode(11,
                                new TreeNode(12,
                                        null,
                                        new TreeNode(13)),
                                null))));
        assertThat(result, is(false));
    }

}