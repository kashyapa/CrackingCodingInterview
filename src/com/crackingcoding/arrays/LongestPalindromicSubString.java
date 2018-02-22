package com.crackingcoding.arrays;

public class LongestPalindromicSubString {
	int maxLen = 0;
	int start = 0;
	public String longestPalindrome(String s) {

		for(int i=0; i<s.length();i++){
			expandAroundCenter(s, i, i);
			expandAroundCenter(s, i, i+1);

		}
		return s.substring(start, start+maxLen);
	}
	public void expandAroundCenter(String s, int i, int j){
		int count = 0;
		while(i>=0 && j< s.length()){
			if(s.charAt(i) == s.charAt(j)){
				i--; j++;
				count++;
			}else{
				break;
			}
		}
		if(count>maxLen){
			start=i+1;
			maxLen = j-i-1;
		}        

	}
	
	public static void main(String[] args){
		System.out.println(new LongestPalindromicSubString().longestPalindrome("babad"));
	}
}
