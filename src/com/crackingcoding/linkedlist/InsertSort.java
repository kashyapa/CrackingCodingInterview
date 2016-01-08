package com.crackingcoding.linkedlist;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head;
		Head = LinkedListUtil.BuildLinkedList();
		LinkedListUtil.PrintList(Head);
		Head = InsertSort(Head);
		LinkedListUtil.PrintList(Head);
	}

	private static ListNode InsertSort(ListNode head) {
		// TODO Auto-generated method stub
		ListNode current = head, next;
		ListNode list= null;
		
		while(current!=null){
			next = current.next;
			current.next = null;
			System.out.println("Inside Calling func: " + current.data);
			list = SortedInsert.SortedInsertElement(list, current);
			current = next;
		}
		return list;
	}

}
