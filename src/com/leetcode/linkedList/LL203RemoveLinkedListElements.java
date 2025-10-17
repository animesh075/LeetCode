/*
203. Remove Linked List Elements

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example 1:

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
*/

package com.leetcode.linkedList;

import java.util.Scanner;

public class LL203RemoveLinkedListElements {
	
	public static ListNode removeElements(ListNode head, int val) {
		if(head == null) return null;
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode curr = temp;
		while(curr.next != null) {
			if(curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return temp.next;
		
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int value = sc.nextInt();

//        head = reverseListItr(head);
        head = removeElements(head , value);
        printList(head);

	}

}
