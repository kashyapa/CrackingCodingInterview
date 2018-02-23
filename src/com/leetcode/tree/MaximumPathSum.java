package com.leetcode.tree;

public class MaximumPathSum {
    public int maxPathSum(TreeNode root) {
        Integer res = new Integer(Integer.MIN_VALUE);
        countSum(root, res);
        return res;
    }

	private int countSum(TreeNode node, Integer res) {
		// TODO Auto-generated method stub
		if(node==null) return 0;
		int lc = countSum(node.left, res);
		int rc = countSum(node.right, res);
		
		int cur = Math.max(node.val, Math.max(node.val+lc, node.val+rc));
		
		res = Math.max(res, Math.max(cur, node.val+lc+rc));
		return cur;
	}
}
