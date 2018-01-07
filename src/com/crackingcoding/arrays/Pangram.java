package com.crackingcoding.arrays;

import java.util.HashSet;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We promptly judged antique ivory buckles for the prize";
		checkPangram(s);

	}

	private static void checkPangram(String s) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet();
		int[] count = new int[26];
		for(int i=0; i<s.length();i++){
			if(Character.isLetter(s.charAt(i))){
				//count[(int)Character.toLowerCase(s.charAt(i))-(int)'a']++;
				set.add(s.charAt(i));
			}
		}
		if(set.size()<26)System.out.println("not pangram");
		else System.out.println("pangram");

		return;
	}

}
