package co.rajat.leetcode;

import co.rajat.leetcode.common.ListNode;

/**
 * Leetcode Problem #2
 * Difficulty: Medium
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode result = new ListNode();
        ListNode resultPointer = result;

        while (l1 != null || l2 != null) {
            int first = (l1 != null) ? l1.val : 0;
            int second = (l2 != null) ? l2.val : 0;
            int sum = first + second + carry;
            carry = sum / 10;
            resultPointer.next = new ListNode(sum % 10);
            resultPointer = resultPointer.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            resultPointer.next = new ListNode(carry);
        }

        return result.next;

    }

}
