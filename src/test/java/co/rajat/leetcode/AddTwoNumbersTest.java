package co.rajat.leetcode;

import co.rajat.leetcode.common.ListNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    private final AddTwoNumbers objectUnderTest = new AddTwoNumbers();

    @Test
    public void addTwoNumbers_trivial() {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actual = objectUnderTest.addTwoNumbers(l1, l2);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void addTwoNumbers_1_99() {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9, new ListNode(9));
        ListNode expected = new ListNode(0, new ListNode(0, new ListNode(1)));
        ListNode actual = objectUnderTest.addTwoNumbers(l1, l2);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void addTwoNumbers_onlyZeros() {

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        ListNode actual = objectUnderTest.addTwoNumbers(l1, l2);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void addTwoNumbers_oneEmptyList() {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode();
        ListNode expected = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode actual = objectUnderTest.addTwoNumbers(l1, l2);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void addTwoNumbers_bothEmptyLists() {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode expected = new ListNode();
        ListNode actual = objectUnderTest.addTwoNumbers(l1, l2);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

    @Test
    public void addTwoNumbers_resultHasMoreDigits() {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode expected = new ListNode(4, new ListNode(8, new ListNode(8, new ListNode(1))));
        ListNode actual = objectUnderTest.addTwoNumbers(l1, l2);
        assertThat(ListNode.isEqual(actual, expected), is(true));

    }

}