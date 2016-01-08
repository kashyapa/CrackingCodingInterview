package com.crackingcoding.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class FrontBackSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = LinkedListUtil.BuildLinkedList();
		LinkedListUtil.PrintList(Head);
		ArrayList <ListNode>list= null;
		
		FrontBackSplit(Head,(list = new ArrayList<ListNode>()));
		
		for(ListNode node: list){
			System.out.print("List index : " +list.indexOf(node) + " : ");
			LinkedListUtil.PrintList(node);
		}
		
	}

	private static ArrayList FrontBackSplit(ListNode head, ArrayList list) {
		// TODO Auto-generated method stub
		ListNode current = head, fast, slow;
		slow = fast = head;
		if(head == null){
			return list;
		}
		else{
			while(fast!=null && fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
			}
			ListNode newList = slow.next;
			slow.next = null;
			list.add(head);
			list.add(newList);
			
		}
		return list;
	}

}
