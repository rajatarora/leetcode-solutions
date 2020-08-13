package co.rajat.leetcode;

import co.rajat.leetcode.common.ListNode;

/**
 * Leetcode Problem #23
 * Difficulty: Hard
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head = new ListNode();
        ListNode pointer = head;

        boolean allNull = false;

        while (!allNull) {
            int minListIndex = 0;
            int min = Integer.MAX_VALUE;
            allNull = true;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    allNull = false;
                    if (min > lists[i].val) {
                        min = lists[i].val;
                        minListIndex = i;
                    }
                }
            }

            if (!allNull) {
                pointer.next = new ListNode(min);
                pointer = pointer.next;
                lists[minListIndex] = lists[minListIndex].next;
            }
        }

        return head.next;

    }

}
