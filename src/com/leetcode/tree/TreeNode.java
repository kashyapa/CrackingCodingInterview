package com.leetcode.tree;

public class TreeNode {

		public TreeNode right, left;
		public int val;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		}
		public TreeNode(int data) {
			super();
			this.left = null;
			this.right = null;
			this.val = data;
		}
		public static TreeNode BuildTree(){
			TreeNode root = new TreeNode(00);
			TreeNode p;
			p = root.left = new TreeNode(20);
			p.left = new TreeNode(10);
			p.right = new TreeNode(25);
			p = root.right = new TreeNode(120);
			p.left = new TreeNode(110);
			p.right = new TreeNode(130);
			return root;
		}
		
}


