package co.rajat.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode Problem #146
 * Difficulty: Medium
 * https://leetcode.com/problems/lru-cache/
 */
public class LRUCache {

    private class DoublyLinkedNode {

        int key;
        int value;
        DoublyLinkedNode next;
        DoublyLinkedNode prev;

        DoublyLinkedNode() {

        }

        DoublyLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    private final int capacity;
    private final Map<Integer, DoublyLinkedNode> cache;
    private final DoublyLinkedNode head;
    private final DoublyLinkedNode tail;

    public LRUCache(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Cache size should be at least 1");
        }
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new DoublyLinkedNode();
        this.tail = new DoublyLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        DoublyLinkedNode node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.get(key).value = value;
            moveToHead(cache.get(key));
        }
        else {
            DoublyLinkedNode node = new DoublyLinkedNode(key, value);
            addNode(node);
            cache.put(key, node);
            if (cache.size() > capacity) {
                DoublyLinkedNode popped = pop();
                cache.remove(popped.key);
            }
        }
    }

    private void addNode(DoublyLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DoublyLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DoublyLinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    private DoublyLinkedNode pop() {
        DoublyLinkedNode popped = tail.prev;
        removeNode(popped);
        return popped;
    }

}
