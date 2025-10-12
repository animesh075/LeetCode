package com.leetcode.linkedList;

public class LLQ19removeNthFromEnd {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node to handle edge cases
		ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node
        second.next = second.next.next;

        return head;
    }
	
	public static void printLL(ListNode head) {
		ListNode curr = head;
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(10);
		head.next = new ListNode(20);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(40);
		head.next.next.next.next =  new ListNode(50);
		
		removeNthFromEnd(head, 1);
		printLL(head);

	}

}
