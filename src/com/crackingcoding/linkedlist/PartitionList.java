package com.crackingcoding.linkedlist;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = new ListNode(10);
		Head = LinkedListUtil.BuildLinkedList();
		
		/*ListNode node = new ListNode(20);
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
		
		node.setNext(new ListNode(22));
		node = node.getNext();
		
		node.setNext(new ListNode(15));
		node = node.getNext();
		
		node.setNext(new ListNode(5));
		node = node.getNext();
		
		node.setNext(null);
		*/
		ListNode current = Head;
		
		PrintList(Head);
		Head = PartitionList(Head, 650);
		PrintList(Head);
	}

	private static ListNode PartitionList(ListNode head, int i) {
		// TODO Auto-generated method stub
		
		ListNode current = head;
		ListNode prev = null;
		
		while(current!=null){
			if (current == head){
				prev = current;
				current = current.next;
				
			}
			else if (current.data < i && current.next!=null){			
				
				prev.next = current.next;
				current.next = head;		
				head = current;
				current = prev.next;
			}
			else if (current.data < i && current.next == null){
				prev.next = null;
				current.next = head;
				head =  current;
			}
			else {
				prev = current;
				current = current.next;
			}	
		}
		
		return head;
	}
	
	private static void PrintList(ListNode Head){
		ListNode current = Head;
		
		while(current!=null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
	}
}
