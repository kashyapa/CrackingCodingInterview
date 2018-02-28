package com.leetcode.stringsnarrays;
/*
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.

https://leetcode.com/problems/minimum-size-subarray-sum/description/

 */
public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums==null) return 0;
        
        int i=0, j=0;
        int sum = 0;
        int min_length=1;
        int len = nums.length;
        if(len==0) return 0;
		while(j<len){
			sum+=nums[j];
			while(sum>=s){
				sum-=nums[i++];
			}			
			min_length = Math.min(min_length, j-i);
		}
        return min_length;
        
    }
}
