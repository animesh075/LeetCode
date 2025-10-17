/*
206. Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 
 */

package com.leetcode.linkedList;

public class LL206ReverseLL {
	
	public static ListNode reverseListRec(ListNode head) {
		if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
		
	}
	
	public static ListNode reverseListItr(ListNode head) {
		ListNode prev = null, curr = head, next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
		
	}
	
	public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

//        head = reverseListItr(head);
        head = reverseListRec(head);
        printList(head);

	}

}
