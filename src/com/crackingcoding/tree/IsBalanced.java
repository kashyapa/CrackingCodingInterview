package com.crackingcoding.tree;

public class IsBalanced {

	public static void main(String[] args){
		
	}
	public static boolean IsTreeBalanced(BinaryTree node){
		
		if (node == null){
			//System.out.println("Yes");
			return true;
		}
		int heightDiff = getHeight(node.left) - getHeight(node.right);
		
		
		if (Math.abs(heightDiff) > 1){
			return false;
		}
		else return IsTreeBalanced(node.left) && IsTreeBalanced(node.right);
	}

	private static int getHeight(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}

}
