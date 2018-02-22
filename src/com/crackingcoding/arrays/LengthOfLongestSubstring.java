package com.crackingcoding.arrays;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap();
		int j = 0;
		int result = 0;
		if(s==null||s.isEmpty()) return 0;
		if(s.length()==1)return 1;

		for(int i = 0; i<s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				j = map.get(s.charAt(i)) + 1;
			}
			map.put(s.charAt(i), i);
			result = Math.max(i-j+1, result);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abba"));
	}

}
