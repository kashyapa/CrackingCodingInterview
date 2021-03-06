package com.leetcode.stringsnarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class FindAnagrams {
  	public List<Integer> findAnagrams(String s, String p) {
		int[] hash = new int[256];
		for(char c:p.toCharArray()){
			hash[c]++;
		}
		int s_len = s.length();
		int p_len = p.length();
		List res = new ArrayList<>();
		
		int left = 0, right =0;
		int count = p_len;
		while(right<s_len){
			if(hash[s.charAt(right++)]-->=1)count--;
			
			if(count==0) res.add(left);
			
			if(right-left == p_len && hash[s.charAt(left++)]++>=0) count++;
		}
  		
  		return res;

	}
	public static void main(String[] args){
		new FindAnagrams().findAnagrams("abab", "ab");
	}
}
