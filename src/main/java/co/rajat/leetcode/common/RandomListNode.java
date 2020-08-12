package co.rajat.leetcode.common;

public class RandomListNode {

    public int val;
    public RandomListNode next;
    public RandomListNode random;

    public RandomListNode() {

    }

    public RandomListNode(int val) {
        this.val = val;
    }

    public static boolean isEqual(RandomListNode l1, RandomListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            else if (l1.random != null && l2.random != null) {
                if ( l1.random.val != l2.random.val) {
                    return false;
                }
            }
            else return l1.random == null && l2.random == null;
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1 == null && l2 == null;
    }

}
