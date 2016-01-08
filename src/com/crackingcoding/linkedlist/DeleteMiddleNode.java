package com.crackingcoding.linkedlist;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = new ListNode(10);
		ListNode node = new ListNode(20);
		ListNode delete;
		Head.setNext(node);
		delete = Head;
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
		ListNode current = Head;
		
		while(current!=null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
		DeleteMiddleElement(delete);
		current = Head;
		while(current!=null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
	}

	private static ListNode DeleteMiddleElement(ListNode node) {
		// TODO Auto-generated method stub
		ListNode next = node.next;
		ListNode current = node;
		while(next!=null){
			if (next.next == null){
				current.next = null;
			}
			current.data = next.data;
			current = current.next;
			next = next.next;			
		}
		return null;
	}

}
