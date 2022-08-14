/*
Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
==========

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
==========

Input: head = [1,2]
Output: [2,1]

Example 3:
==========

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

/**
 * Definition for singly-linked list.
 * */
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

public class ReverseSinglyLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
        return head;
    }

    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        ListNode curr = head;
        curr.next = node;
        curr = curr.next;
        node = new ListNode(3);
        curr.next = node;
        curr = curr.next;
        node = new ListNode(4);
        curr.next = node;
        curr = curr.next;
        node = new ListNode(5);

        curr = head;
        System.out.println("Before Reverse:");
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        curr = reverseList(head);
        System.out.println("\nAfter Reverse:");
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
