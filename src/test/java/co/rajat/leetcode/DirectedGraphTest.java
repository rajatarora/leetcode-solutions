package co.rajat.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DirectedGraphTest {

    @Test
    public void bfsTest_trivial() {

        DirectedGraph objectUnderTest = new DirectedGraph(4);

        objectUnderTest.addEdge(0, 1);
        objectUnderTest.addEdge(0, 2);
        objectUnderTest.addEdge(1, 2);
        objectUnderTest.addEdge(2, 0);
        objectUnderTest.addEdge(2, 3);
        objectUnderTest.addEdge(3, 3);

        List<Integer> expected = Arrays.asList(2, 0, 3, 1);
        List<Integer> result = objectUnderTest.bfs(2);

        assertThat(result, is(expected));

    }

}