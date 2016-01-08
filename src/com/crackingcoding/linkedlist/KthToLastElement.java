package com.crackingcoding.linkedlist;

public class KthToLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		ListNode current = Head;
		
		while(current!=null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
		node = FindKthToLastElement(Head, 10);
	}
	public static ListNode FindKthToLastElement(ListNode node, int k){
		int steps = 0;
		ListNode KthToLastNode;
		ListNode current = node;
		
		while (steps<k && current!=null){
			current = current.next;
			steps++;
		}
		if (current == null){
			return node;
		}
		KthToLastNode = node;
		while (current!=null){
			current=current.next;
			KthToLastNode = KthToLastNode.next;
		}
		
		System.out.println(KthToLastNode.data);
		current = node;
		/*while(current!=null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");*/
		
		return node;
		
	}
}
