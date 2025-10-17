/*
234. Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:

Input: head = [1,2,2,1]
Output: true
Example 2:

Input: head = [1,2]
Output: false

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */

package com.leetcode.linkedList;

public class LL234PalindromeLL {
	
	public static boolean isIdentical(ListNode l1, ListNode l2) {
		while(l1 != null && l2 != null) {
			if(l1.val != l2.val) return false;
			l1 = l1.next;
			l2 = l2.next;
		}
		return true;
	}
	
	public static ListNode reverseLL(ListNode head) {
		ListNode prev = null, curr = head, next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
		
	}
	
	public static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) return true;
		
		ListNode slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode head2 = reverseLL(slow.next);
		slow.next = null;
		
		boolean result = isIdentical(head, head2);
		
		head2 = reverseLL(head2);
		slow.next = head2;
		
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Linked list : 1->2->3->2->1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean result = isPalindrome(head);

        if (result)
            System.out.println("true");
        else
            System.out.println("false");

	}

}
