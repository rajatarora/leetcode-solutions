package co.rajat.leetcode;

import co.rajat.leetcode.common.ListNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeKSortedListsTest {

    private final MergeKSortedLists objectUnderTest = new MergeKSortedLists();

    @Test
    public void mergeKLists_trivial() {

        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] input = new ListNode[]{l1, l2, l3};

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));
        ListNode actual = objectUnderTest.mergeKLists(input);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void mergeKLists_singleEmptyList() {

        ListNode l1 = new ListNode();
        ListNode[] input = new ListNode[]{l1};

        ListNode expected = new ListNode();
        ListNode actual = objectUnderTest.mergeKLists(input);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void mergeKLists_multipleEmptyLists() {

        ListNode[] input = new ListNode[]{null, null};

        ListNode actual = objectUnderTest.mergeKLists(input);
        assertThat(ListNode.isEqual(actual, null), is(true));

    }

    @Test
    public void mergeKLists_singleNonEmptyList() {

        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode[] input = new ListNode[]{l1, null, null};

        ListNode expected = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode actual = objectUnderTest.mergeKLists(input);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void mergeKLists_disjointLists() {

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(8, new ListNode(9, new ListNode(10)));
        ListNode l3 = new ListNode(13, new ListNode(14, new ListNode(15)));
        ListNode[] input = new ListNode[]{l1, l2, l3};

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(8,
                new ListNode(9, new ListNode(10, new ListNode(13,
                        new ListNode(14, new ListNode(15)))))))));
        ListNode actual = objectUnderTest.mergeKLists(input);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }
}