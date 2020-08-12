package co.rajat.leetcode.common;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ListNodeTest {

    @Test
    public void isEqual_emptyList() {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        assertThat(ListNode.isEqual(l1, l2), is(true));

    }

    @Test
    public void isEqual_singleElementEqualLists() {

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        assertThat(ListNode.isEqual(l1, l2), is(true));

    }

    @Test
    public void isEqual_singleElementUnequalLists() {

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(6);
        assertThat(ListNode.isEqual(l1, l2), is(false));

    }

    @Test
    public void isEqual_unequalLengthLists() {

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5, new ListNode(5));
        assertThat(ListNode.isEqual(l1, l2), is(false));

    }

    @Test
    public void isEqual_multiElementEqualLists() {

        ListNode l1 = new ListNode(5, new ListNode(7));
        ListNode l2 = new ListNode(5, new ListNode(7));
        assertThat(ListNode.isEqual(l1, l2), is(true));

    }

    @Test
    public void isEqual_multiElementUnequalLists() {

        ListNode l1 = new ListNode(5, new ListNode(7));
        ListNode l2 = new ListNode(5, new ListNode(6));
        assertThat(ListNode.isEqual(l1, l2), is(false));

    }
}