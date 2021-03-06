package com.leetcode.stringsnarrays;
/*
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
Example 1:
Input:s1 = "ab" s2 = "eidbaooo"
Output:True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False
Note:
The input strings only contain lower case letters.
The length of both given strings is in range [1, 10,000].

https://leetcode.com/problems/permutation-in-string/description/

 */
public class PermutationInString {
	public boolean checkInclusion(String s1, String s2) {
        //if(s2.length()<s1.length()) return checkInclusion(s2,s1);
        
        int[] hash = new int[256];
        
        for(char c:s1.toCharArray()){
        	hash[(int) c]++;
        }
        int s1_len = s1.length();
        int s2_len = s2.length();
        int count = s1.length();
        
        int left=0, end = 0;
        while(end<s2_len){
        	if(hash[(int)s2.charAt(end++)]-- > 0) count--;
        	if(count==0) return true;
        	if(end-left==s1_len && hash[(int)s2.charAt(left++)]++ >=0)count++;
        }
		return false;       
    }
	public static void main(String[] args){
		new PermutationInString().checkInclusion("ab", "a");
	}
}
