package co.rajat.leetcode;

import co.rajat.leetcode.common.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode Problem #138
 * Difficulty: Medium
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 */
public class CopyListWithRandomPointer {

    private final Map<RandomListNode, RandomListNode> visited = new HashMap<>();

    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null) {
            return null;
        }

        if (visited.containsKey(head)) {
            return visited.get(head);
        }

        RandomListNode node = new RandomListNode(head.val);
        visited.put(head, node);
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;

    }

}
