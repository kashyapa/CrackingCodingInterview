package com.crackingcoding.linkedlist;

public class SwapNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Head = LinkedListUtil.BuildLinkedList();
		
		LinkedListUtil.PrintList(Head);
		
		Head = swapNodes(Head);
		//LinkedListUtil.PrintList(Head);
	}
	private static ListNode swapNodes(ListNode head) {
		// TODO Auto-generated method stub
		ListNode swapA = head;
		ListNode swapB = head.next, nextPlusPlus = null, prev = null;
		swapB = swapA.next;
		while(swapA != null && swapA.next != null){
			//System.out.println(swapA.data + " : " + swapB.data);
			nextPlusPlus = swapB.next;
			if(prev!=null){
				prev.next = swapB;
			}
			swapA.next = swapB.next;
			swapB.next = swapA;
			if(swapA == head){
				head = swapB;
			}
			prev = swapA;		
			swapA = nextPlusPlus;
			if(swapA!=null){
				swapB = swapA.next;
			}
		}
		LinkedListUtil.PrintList(head);
		return head;
	}
}
