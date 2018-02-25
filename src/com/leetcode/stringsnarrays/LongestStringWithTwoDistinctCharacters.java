package com.leetcode.stringsnarrays;
/*
 * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/description/

 */
public class LongestStringWithTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
		if(s==null) return -1;
    	int s_len = s.length();
		if(s_len==0) return 0;
		int max = 1;
		int[]hash = new int[128];
		int distinct=0;
		
		int i=0, j=0;
		
		while(j<s_len){
			if(hash[s.charAt(j++)]++==0) distinct++;
			while(distinct>2){
				if(hash[s.charAt(i++)]-- == 1) distinct--;
			}
			max = Math.max(j-i, max);
		}
		return max;
        
    }
}
