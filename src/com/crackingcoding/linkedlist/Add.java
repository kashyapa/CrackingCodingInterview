package com.crackingcoding.linkedlist;
//Does not work
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add 123+876
		ListNode h1, h2;
		ListNode p1 = new ListNode(3);
		h1 = p1;
		p1.setNext(new ListNode(2));
		p1 = p1.next;
		
		p1.setNext(new ListNode(1));
		p1 = p1.next;
		
		ListNode p2 = new ListNode(6);
		h2 = p2;
		p2.setNext(new ListNode(7));
		p2 = p2.next;
		
		p2.setNext(new ListNode(8));
		p2 = p2.next;
		
		PrintList(h1);
		PrintList(h2);
		
		System.out.println(Add(h1,h2));
		
		
	}
	static int sum=0;
	private static int Add(ListNode p1, ListNode p2) {
		// TODO Auto-generated method stub
		
		if(p1.next == null && p2.next == null){
			 return p1.data+p2.data;
		}
		
		sum = Add(p1.next,p2.next);
		sum += p1.data+p2.data;
		System.out.println(sum);
		return sum;
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
