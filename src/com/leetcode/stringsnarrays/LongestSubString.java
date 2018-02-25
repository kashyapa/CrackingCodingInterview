package com.leetcode.stringsnarrays;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
		int i = 0, j = 0;
		int s_len = s.length();
		int []hash = new int [128];
		int max = 1;
		
		while(j < s_len){
			if(hash[s.charAt(j++)]++>=1){
				while(hash[s.charAt(i++)]--<=1);
			}
			max = Math.max(j-i, max);
		}
    	return max;       
    }
}
