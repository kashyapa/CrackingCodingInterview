package com.leetcode.stringsnarrays;
/*
 * 
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 

Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1.

https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/

 */
public class LongestIncreasingContinuousSequence {
	 public int findLengthOfLCIS(int[] nums) {
	        if(nums==null||nums.length==0) return -1;
	        int max = 1;
	        int prev = nums[0];
	        int start=0, end = 0;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]<=prev){
	                start=i;
	            }
	            else{
	                end = i;
	                max = Math.max(end-start+1,max);
	            }
	            prev = nums[i];
	        }
			return max;
	    }
	 public static void main(String[] args){
		 System.out.println(new LongestIncreasingContinuousSequence().findLengthOfLCIS(new int[] {2,2,2,2,2}));
	 }
}
