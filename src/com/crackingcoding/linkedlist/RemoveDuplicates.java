package com.crackingcoding.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {

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
		
		node.setNext(null);
		ListNode current = Head;
		
		while(current!=null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
		node = RemoveDuplicateItems(Head);
		
	}
	public static ListNode RemoveDuplicateItems(ListNode node){
		ListNode current, prev;
		HashSet hSet = new HashSet();
		current = node;
		prev = null;
		while(current!=null){
			if (hSet.contains(current.data) == true){
				current = current.next;
				prev.next = current;
			}
			else{
				hSet.add(current.data);
				prev = current;
				current = current.next;
			}			
		}
		current=node;
		while(current!=null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
		
		return node;
		
	}

}