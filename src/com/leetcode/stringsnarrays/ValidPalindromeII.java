package com.leetcode.stringsnarrays;
/*
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
https://leetcode.com/problems/valid-palindrome-ii/description/
 */
public class ValidPalindromeII {
	public boolean validPalindrome(String s) {
		int i=0, j = s.length()-1;
		while(i<j && s.charAt(i)==s.charAt(j)){
			i++; 
			j--;
		}
		
		if(i<j) return isValidPalindrome(s, i+1, j)||isValidPalindrome(s, i,j-1);
		return i>=j;

	}

	private boolean isValidPalindrome(String s, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j && s.charAt(i++) == s.charAt(j--));
		return i>=j;
	}
}
