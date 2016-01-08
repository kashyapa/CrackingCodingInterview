package com.crackingcoding.linkedlist;

public class DetectLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = new ListNode(10);
		ListNode node = new ListNode(20);
		ListNode loopNode;
		
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
		loopNode = node;
		node.setNext(new ListNode(678));
		node = node.getNext();
		
		node.setNext(loopNode);
		
		
		
		DetectLoop(Head);
		PrintList(Head);
	}

	private static void DetectLoop(ListNode head) {
		// TODO Auto-generated method stub
		ListNode current = head;
		ListNode prev, fast, slow;
		prev = null;
		slow = head;
		fast = head;
		while(fast != null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast){
				break;
			}
		}
		
		if(fast == null||fast.next==null){
			return;
		}
		slow = head;
		while(slow!=fast){
			prev= fast;
			slow= slow.next;
			fast = fast.next;
			System.out.println(prev.data);
		}
		prev.next = null;
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
