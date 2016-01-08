package com.crackingcoding.linkedlist;

import java.awt.List;

public class SortedInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = null;
		Head = LinkedListUtil.Push(Head, 10);
		Head.next = LinkedListUtil.Push(Head.next, 20);
		
		ListNode tail = Head.next; 
		
		tail.next = LinkedListUtil.Push(tail.next, 30);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 50);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 60);
		tail = tail.next;
		
		Head = SortedInsertElement(Head, new ListNode(40));
		Head = SortedInsertElement(Head, new ListNode(70));
		
		LinkedListUtil.PrintList(Head);
	
	}

	public static ListNode SortedInsertElement(ListNode head, ListNode p) {
		// TODO Auto-generated method stub
		//ListNode p = new ListNode(data);
		ListNode current = head, prev = null;
		
		if(head == null || p.data <= head.data){
			p.next = head;
			return p;
		}
		else {
				while(current.next!=null && p.data >= current.next.data ){
					current = current.next;					
				}
				
				p.next = current.next;	
				current.next = p;
		}
//		while ( p.data >= current.data &&  current.next!=null ){
//			prev =current;
//			current = current.next;			
//		}
//		if(prev == null||current == head){
//			//System.out.println("loc A");
//			if (p.data >= current.data){
//				current.next = p;
//			}
//			else{
//				p.next = current;
//			}
//		}
//		else if (current.next == null){
//			//System.out.println("Loc B");
//			if (p.data >= current.data){
//				current.next = p;
//			}
//			else{
//				prev.next = p;
//				p.next = current;
//			}
//			//p.next = null;
//		}
//		else{ 
//			//System.out.println("Loc C");
//			prev.next = p;
//			p.next = current;
//		}		
		return head;
		
	}

}
