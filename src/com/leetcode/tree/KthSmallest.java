package com.leetcode.tree;

public class KthSmallest {
	int result=0;
	int count = Integer.MAX_VALUE;
	
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        count =k;
        traverse(root);
		return count;
    }
    private void traverse(TreeNode root) {
		// TODO Auto-generated method stub
    	traverse(root.left);
        if(--count == 0){
        	result = root.val;
            return;
        }
        traverse(root.right);

	}
	public static void main(String[] args){
    	
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		new KthSmallest().kthSmallest(root,2);
		return;
    }
}
