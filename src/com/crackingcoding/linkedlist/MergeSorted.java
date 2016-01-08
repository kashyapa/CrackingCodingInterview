package com.crackingcoding.linkedlist;

public class MergeSorted {
	private static ListNode merger = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = new ListNode(10);
		ListNode node = new ListNode(20);
		Head.setNext(node);
		
		
		node.setNext(new ListNode(25));
		node = node.getNext();
		
		node.setNext(new ListNode(30));
		node = node.getNext();
		
		node.setNext(new ListNode(34));
		node = node.getNext();
		node.next = null;
		
		ListNode Head2 = new ListNode(22);
		
		Head2.next = new ListNode(25);
		node = Head2.next;
		
		node.setNext(new ListNode(30));
		node = node.getNext();
			
		node.setNext(new ListNode(35));
		node = node.getNext();
		
		node.setNext(new ListNode(645));
		node = node.getNext();
		
		node.setNext(new ListNode(678));
		node = node.getNext();
		
		node.setNext(null);
		System.out.print("List 1 :");
		PrintList(Head2);
		System.out.print("List 2 :");
		PrintList(Head);

		MergeSorted(Head, Head2);
		PrintList(merger);
	}
	
	private static void MergeSorted(ListNode head, ListNode head2) {
		// TODO Auto-generated method stub
		ListNode current1 = head;
		ListNode current2 = head2;
		ListNode temp;
		while(current1!=null || current2!=null){			
			if(current1 == null){
				MoveNode(current2);
				current2 = null;
			}
			else if (current2 == null){
				MoveNode(current1);
				current1 =null;
			}
			
			else if (current1.data<=current2.data){
				temp = current1;
				current1 = current1.next;
				temp.next = null;
				MoveNode(temp);
				
			}
			else if (current2.data<=current1.data){
				temp = current2;
				current2 = current2.next;
				temp.next = null;
				MoveNode(temp);
			}
		}		
	}
	private static void MoveNode(ListNode node) {
		// TODO Auto-generated method stub
		if (merger == null){
			merger = node;
			merger.next = null;
		}
		else{
			ListNode current = merger;
			while(current.next!=null && current.next.data <=node.data){
				current = current.next;
			}
			current.next = node;	
		}		
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
