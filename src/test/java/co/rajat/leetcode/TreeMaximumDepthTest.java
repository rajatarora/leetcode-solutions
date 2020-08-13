package co.rajat.leetcode;

import co.rajat.leetcode.common.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TreeMaximumDepthTest {

    private final TreeMaximumDepth objectUnderTest = new TreeMaximumDepth();

    @Test
    public void maxDepth_trivial() {

        TreeNode input = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));
        int result = objectUnderTest.maxDepth(input);
        assertThat(result, is(3));

    }

    @Test
    public void maxDepth_nullTree() {

        int result = objectUnderTest.maxDepth(null);
        assertThat(result, is(0));

    }

    @Test
    public void maxDepth_singleElement() {

        TreeNode input = new TreeNode(1);
        int result = objectUnderTest.maxDepth(input);
        assertThat(result, is(1));

    }
}