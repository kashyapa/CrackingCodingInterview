package com.crackingcoding.linkedlist;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class RotateList {
	 public static ListNode rotateRight(ListNode head, int k) {
	        
	        if(head==null||head.next==null) return  head;
	        ListNode front = head;
	        ListNode cur = head;
	        int length= 0;
	        int c = k;
	        while(c-->0 && front!=null){
	            front = front.next;
	        }
	        while(front!=null && front.next!=null){
	            cur = cur.next;
	            front =front.next;
	        }
	        front.next = head;
	        head = cur.next;
	        cur.next = null;
	        return head;
	        
	    }
	 public static void main(String[] args){
		 ListNode head = new ListNode(1);
		 ListNode cur = head;
		 cur.next = new ListNode(2);
		 cur = cur.next;
		 /*cur.next = new ListNode(3);
		 cur = cur.next;
		 cur.next = new ListNode(4);
		 cur = cur.next;
		 cur.next = new ListNode(5);
		 cur = cur.next;
*/
		 
		 ListNode.printList(head);
		 ListNode.printList(rotateRight(head, 2));
	 }
}
