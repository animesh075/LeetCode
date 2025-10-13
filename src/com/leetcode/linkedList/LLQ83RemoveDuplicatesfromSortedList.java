package com.leetcode.linkedList;

/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
Return the linked list sorted as well.

Example 1:

Input: head = [1,1,2]
Output: [1,2]
Example 2:

Input: head = [1,1,2,3,3]
Output: [1,2,3] 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
 
 */

public class LLQ83RemoveDuplicatesfromSortedList {
	
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		while(curr!=null && curr.next!=null) {
			if(curr.val == curr.next.val) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
			}
			
		}
		return head;
	}
	
	public static void printLL(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(3);

        deleteDuplicates(l1);
        printLL(l1);

	}

}
