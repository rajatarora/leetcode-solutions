package co.rajat.leetcode;

import co.rajat.leetcode.common.RandomListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class CopyListWithRandomPointerTest {

    private final CopyListWithRandomPointer objectUnderTest = new CopyListWithRandomPointer();

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
    public void copyRandomList_trivial() {

        buildCompleteRandomList();
        RandomListNode result = objectUnderTest.copyRandomList(l1);
        assertThat(RandomListNode.isEqual(l1, result), is(true));

    }

    @Test
    public void copyRandomList_singleItemList() {

        RandomListNode result = objectUnderTest.copyRandomList(l1);
        assertThat(RandomListNode.isEqual(l1, result), is(true));

    }

    @Test
    public void copyRandomList_nullList() {

        RandomListNode result = objectUnderTest.copyRandomList(null);
        assertThat(result, is(nullValue()));

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