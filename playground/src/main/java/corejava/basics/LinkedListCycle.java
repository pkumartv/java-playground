package corejava.basics;

/*
 * Linked List Cycle Problem Statement # Given the head of a Singly LinkedList, write a function to
 * determine if the LinkedList has a cycle in it or not.
 * 
 * 
 * 
 * Time Complexity # As we have concluded above, once the slow pointer enters the cycle, the fast
 * pointer will meet the slow pointer in the same loop. Therefore, the time complexity of our
 * algorithm will be O(N) where ‘N’ is the total number of nodes in the LinkedList.
 * 
 * Space Complexity # The algorithm runs in constant space O(1)
 * 
 */
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}


public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true; // found cycle
            }
        }

        return false;

    }

    /*
     * Problem 1: Given the head of a LinkedList with a cycle, find the length of the cycle.
     * 
     * Solution: We can use the above solution to find the cycle in the LinkedList. Once the fast
     * and slow pointers meet, we can save the slow pointer and iterate the whole cycle with another
     * pointer until we see the slow pointer again to find the length of the cycle.
     */

    public static int findCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return calculateLength(slow); // found cycle
            }
        }
        return 0;
    }

    private static int calculateLength(ListNode slow) {
        ListNode currentListNode = slow;
        int cycleLength = 0;
        do {
            currentListNode = currentListNode.next;
            cycleLength++;
        } while (currentListNode != slow);
        return cycleLength;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("LinkedList has cycle " + LinkedListCycle.hasCycle(head));
        head.next.next.next.next.next.next = head.next.next;

        System.out.println("LinkedList has cycle " + LinkedListCycle.hasCycle(head));
        System.out.println("LinkedList cycleLength " + LinkedListCycle.findCycleLength(head));

        head.next.next.next.next.next.next = head.next.next.next.next;
        System.out.println("LinkedList has cycle " + LinkedListCycle.hasCycle(head));
        System.out.println("LinkedList has cycle " + LinkedListCycle.findCycleLength(head));


    }

}
