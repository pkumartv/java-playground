package corejava.basics;

import java.util.logging.Logger;

/*
 * Problem Statement # Given the head of a Singly LinkedList, write a method to return the middle
 * node of the LinkedList.
 * 
 * If the total number of nodes in the LinkedList is even, return the second middle node.
 * 
 * Example 1:
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> null Output: 3 Example 2:
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null Output: 4 Example 3:
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> null Output: 4
 */

/*
 * Prerequisite : confirm is list has cycles or not ?? If Not then go ahead with a simple util.
 */
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}


public class MiddleOfLinkedList {

    public static final Logger LOG= Logger.getLogger("MiddleOfLinkedList");

    /*
     * Brute Force method
     */
    public static int getMiddleNode(ListNode head) {
        /*
         * Navigate through the entire list 
         * get the length 
         * find the middle odd/env navigate again to
         * the middle node Space O(1) Time O(N+M)
         */
        int length = getLengthOfLinkedList(head);
        LOG.info("Length of linkedlist is : "+length);
        int lengthOfMiddleNode;
        if(length % 2 == 0){
            lengthOfMiddleNode= length/2;
        }
        else
            lengthOfMiddleNode= length/2;

        LOG.info("Middle node is at "+ lengthOfMiddleNode);
        ListNode current=head;
        for(int i=0; i < lengthOfMiddleNode ; i++, current=current.next ){

        }
        

        return current.value;
    }

    private static int getLengthOfLinkedList(ListNode head) {
        int length=0;
        ListNode current=head;
        do{
            ++length;
            current=current.next;
        } while(current!=null);

        return length;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        LOG.info("Middle Node is : " + getMiddleNode(head));



    }

}
