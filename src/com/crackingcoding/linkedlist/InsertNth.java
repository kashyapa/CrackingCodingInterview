package com.crackingcoding.linkedlist;

public class InsertNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null;
		//head = LinkedListUtil.BuildLinkedList();
		
		head = LinkedListUtil.Push(head, 1);
		head.next = LinkedListUtil.Push(head.next, 2);
		
		ListNode tail = null, current = null;
		current = head;
		
		while(current.next!=null){
			current = current.next;			
		}
		tail = current;
		tail.next = LinkedListUtil.Push(tail.next, 534);
		
		LinkedListUtil.PrintList(head);
		
		InsertNth(head, 4, 766);
		InsertNth(head, 14, 3);
		InsertNth(head, 1, 20);
		InsertNth(head, 1, 40);

		LinkedListUtil.PrintList(head);
	}

	private static void InsertNth(ListNode head, int count, int data) {
		// TODO Auto-generated method stub
		
		ListNode current = head, prev = null;
		int index = 0;
		while(index < count && current.next!=null){
			prev = current;
			current = current.next;
			index++;
		}
		if(current.next == null){
			current.next = LinkedListUtil.Push(current.next, data);
		}else{
			ListNode p = prev;
			p.next = LinkedListUtil.Push(p.next, data);
		}
		
	}

}
