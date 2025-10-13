/*

21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
*/
package com.leetcode.linkedList;

public class LLQ21MergeTwoSortedList {
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode temp = new ListNode(0);
		ListNode curr = temp;
		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				curr.next = list1;
				list1 = list1.next;
			}else {
				curr.next = list2;
				list2 = list2.next;
			}
			curr = curr.next;
		}
		
		curr.next = list1 == null ? list2 : list1;
		return temp.next;
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
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);
        printLL(result);

	}

}
