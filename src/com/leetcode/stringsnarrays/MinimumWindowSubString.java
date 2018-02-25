package com.leetcode.stringsnarrays;
/*
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
https://leetcode.com/problems/minimum-window-substring/description/
 */
public class MinimumWindowSubString {
	 public String minWindow(String s, String t) {
 		 int[] hash = new int[128];
		 for(char c: t.toCharArray()){
			 hash[(int)c]++;
		 }
		 
		 int left = 0, right = 0;
		 int t_len=t.length();
		 int count = t_len;
		 int s_len = s.length();
		 int min_length = Integer.MAX_VALUE;
		 int window_start=0, window_end=0;
		 while(right<s_len){
			 if(hash[(int) s.charAt(right++)]-- > 0) count--;
			 while(count==0){
				 if(right-left<min_length) {
					 window_start=left; 
					 window_end=right;
				 }
				 min_length = Math.min(right-left, min_length);	
				 if(hash[(int)s.charAt(left++)]++ >= 0) count++;
			 }
		 }
		 return s.substring(window_start, window_end);
	        
	 }
	 public static void main(String[] args){
		 System.out.println(new MinimumWindowSubString().minWindow("ADOBECODEBANC", "ABC"));
	 }
}
