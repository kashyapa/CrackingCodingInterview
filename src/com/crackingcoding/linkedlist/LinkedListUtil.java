package com.crackingcoding.linkedlist;

public class LinkedListUtil {
		//public static ListNode Head;
		public static ListNode BuildLinkedList(){
			ListNode Head = new ListNode(10);
			ListNode node = new ListNode(20);
			Head.setNext(node);
			node.setNext(new ListNode(30));
			node = node.getNext();
			
			node.setNext(new ListNode(25));
			node = node.getNext();
			
			node.setNext(new ListNode(34));
			node = node.getNext();
			
			node.setNext(new ListNode(30));
			node = node.getNext();
			
			node.setNext(new ListNode(25));
			node = node.getNext();
			
			node.setNext(new ListNode(35));
			node = node.getNext();
			
			node.setNext(new ListNode(645));
			node = node.getNext();
			
			node.setNext(new ListNode(678));
			node = node.getNext();
			
			node.setNext(null);
			return Head;
		}
		public static void PrintList(ListNode Head){
			ListNode current = Head;
			
			while(current!=null){
				System.out.print(current.data+"-->");
				current = current.next;
			}
			System.out.println("null");
		}
		
		public static ListNode Push(ListNode node, int data){
			ListNode p = new ListNode(data);
			p.next = node;		
		//	System.out.println( p.data + " : " + node.data );
			
			return p;
		}
}
