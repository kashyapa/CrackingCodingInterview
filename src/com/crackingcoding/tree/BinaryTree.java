package com.crackingcoding.tree;

public class BinaryTree {
	public BinaryTree right, left;
	public int data;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	public BinaryTree(int data) {
		super();
		this.left = null;
		this.right = null;
		this.data = data;
	}
	public static BinaryTree BuildTree(){
		BinaryTree root = new BinaryTree(00);
		BinaryTree p;
		p = root.left = new BinaryTree(20);
		p.left = new BinaryTree(10);
		p.right = new BinaryTree(25);
		p = root.right = new BinaryTree(120);
		p.left = new BinaryTree(110);
		p.right = new BinaryTree(130);
		return root;
	}
	
}
