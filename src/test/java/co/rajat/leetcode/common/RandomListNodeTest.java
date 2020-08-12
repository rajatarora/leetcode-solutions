package co.rajat.leetcode.common;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RandomListNodeTest {

    private RandomListNode l1, l2, l3, l4, l5, l6;

    @Before
    public void setUp() {
        l1 = new RandomListNode(1);
        l2 = new RandomListNode(2);
        l3 = new RandomListNode(3);
        l4 = new RandomListNode(4);
        l5 = new RandomListNode(5);
        l6 = new RandomListNode(6);

    }

    @Test
    public void isEqual_emptyLists() {

        RandomListNode l1 = new RandomListNode();
        RandomListNode l2 = new RandomListNode();
        Boolean result = RandomListNode.isEqual(l1, l2);
        assertThat(result, is(true));

    }

    @Test
    public void isEqual_equalLists() {

        buildCompleteRandomList();
        Boolean result = RandomListNode.isEqual(l1, l1);
        assertThat(result, is(true));

    }

    @Test
    public void isEqual_unequalValueLists() {

        Boolean result = RandomListNode.isEqual(l1, l2);
        assertThat(result, is(false));

    }

    @Test
    public void isEqual_unequalRandomLists() {

        l1.val = 10;
        l2.val = 10;
        l1.random = l2;
        l2.random = l3;

        Boolean result = RandomListNode.isEqual(l1, l2);
        assertThat(result, is(false));

    }

    private void buildCompleteRandomList() {
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l1.random = l2;
        l2.random = l1;
        l3.random = l1;
        l4.random = l5;
        l5.random = l2;
        l6.random = l2;
    }

}