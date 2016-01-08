package com.crackingcoding.linkedlist;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = LinkedListUtil.BuildLinkedList();
		LinkedListUtil.PrintList(Head);
		Head = Reverse(Head);
		LinkedListUtil.PrintList(Head);
	}

	private static ListNode Reverse(ListNode head) {
		// TODO Auto-generated method stub
		if(head ==null){
			return head;
		}
		else{
			ListNode current = head, next = current.next, prev =null;
			while(current!=null){
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;		
			}
			head = prev;
		}
		return head;
	}
}
