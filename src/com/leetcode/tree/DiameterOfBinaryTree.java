package com.leetcode.tree;

public class DiameterOfBinaryTree {
/*
 * 	Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary
 *  tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *  Example:
	Given a binary tree 
	          1
	         / \
	        2   3
	       / \     
	      4   5    
	Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 */
	
    public int diameterOfBinaryTree(TreeNode root) {
    	int max=Integer.MIN_VALUE;
    	countHeight(root.left, max);
    	
    	
    	return 0;        
    }

	private int countHeight(TreeNode node, int res) {
	// TODO Auto-generated method stub
		
		if(node ==null) return 0;
		
		int lh = countHeight(node.left, res);
		int rh = countHeight(node.right, res);
		
		int ret = 1+Math.max(lh, rh);
		res = Math.max(res, ret);
		
		return ret;
	}

	
	
}
