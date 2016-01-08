package com.crackingcoding.linkedlist;

import java.util.Stack;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = null;//LinkedListUtil.BuildLinkedList();
//		ListNode Head = new ListNode(10);
//		ListNode node = new ListNode(20);
//		Head.setNext(node);
//		node.setNext(new ListNode(30));
//		node = node.getNext();
//		
//		node.setNext(new ListNode(25));
//		node = node.getNext();
//		
//		node.setNext(new ListNode(34));
//		node = node.getNext();
//		
//		node.setNext(new ListNode(25));
//		node = node.getNext();
//		
//		node.setNext(new ListNode(30));
//		node = node.getNext();
//		
//		node.setNext(new ListNode(20));
//		node = node.getNext();
//		
//		node.setNext(new ListNode(10));
//		node = node.getNext();
//		
//		node.setNext(null);
		Head = LinkedListUtil.Push(Head, 10);
		ListNode tail = Head;
		tail.next = LinkedListUtil.Push(tail.next, 20);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 30);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 40);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 20);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 40);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 30);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 20);
		tail = tail.next;
		
		tail.next = LinkedListUtil.Push(tail.next, 10);
		tail = tail.next;
		PrintList(Head);
		IsPalindrome(Head);
	}
	private static void IsPalindrome(ListNode head) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		int data = 0;
		ListNode fast, slow;
		fast = slow = head;
		while(fast!=null && fast.next!=null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast!=null){
			slow = slow.next;
		}
				
		while(stack.isEmpty() == false && slow!=null){
			if((data = (Integer)stack.pop()) == slow.data){
				slow = slow.next;		
			}
			else{
				System.out.println("It is not a palindrome");
				slow = null;
			}
			if (stack.isEmpty() == true){
				System.out.println("It is a palindrome");
			}
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
