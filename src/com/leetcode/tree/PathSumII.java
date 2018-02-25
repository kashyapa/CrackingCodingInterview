package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/*
 *   Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]

 * 
 */
public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> paths = new ArrayList();
		List<Integer>path = new ArrayList();
		findPathSum(root, sum, paths, path);
		return paths;
	}

	private void findPathSum(TreeNode node, int sum, List<List<Integer>> paths, List path) {
		// TODO Auto-generated method stub
		if(node==null) return;

		path.add(new Integer(node.val));
		sum-=node.val;
		if(sum==0 && node.left==null && node.right==null){
			paths.add(new ArrayList(path));
		}
		findPathSum(node.left, sum, paths, path);
		findPathSum(node.right, sum, paths, path);		
		path.remove(path.size()-1);		
		return;
	}
}
