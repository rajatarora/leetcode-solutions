package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void cacheTest_trivial() {

        LRUCache objectUnderTest = new LRUCache(2);
        objectUnderTest.put(10,13);
        objectUnderTest.put(3,17);

        int result = objectUnderTest.get(10);
        assertThat(result, is(13));

    }

    @Test
    public void cacheTest_exceedCapacity() {

        LRUCache objectUnderTest = new LRUCache(2);
        objectUnderTest.put(10,13);
        objectUnderTest.put(3,30);
        objectUnderTest.put(4,18);

        int result = objectUnderTest.get(10);
        assertThat(result, is(-1));

    }

    @Test
    public void cacheTest_removeLRU() {

        LRUCache objectUnderTest = new LRUCache(2);
        objectUnderTest.put(10,13);
        objectUnderTest.put(3,30);
        objectUnderTest.get(10);
        objectUnderTest.put(4,18);

        int result = objectUnderTest.get(10);
        assertThat(result, is(13));

    }

    @Test
    public void cacheTest_updateKey() {

        LRUCache objectUnderTest = new LRUCache(2);
        objectUnderTest.put(10,13);
        objectUnderTest.put(3,30);
        objectUnderTest.put(10,18);

        int result = objectUnderTest.get(10);
        assertThat(result, is(18));

    }

    @Test(expected = IllegalArgumentException.class)
    public void cacheTest_initializeZeroCapacity() {

        LRUCache objectUnderTest = new LRUCache(0);

    }

}