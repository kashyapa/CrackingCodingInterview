package com.crackingcoding.arrays;

import java.util.HashMap;

public class Compressor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabccccaaa";
		int count=0;
		int j=0;
		char last;
	//	HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();		
		String myStr = new String();
		last = str.charAt(0);
		
		while(j<str.length()){
			while(j< str.length() && str.charAt(j) == last){
				count++;
				j++;
			}
			myStr = myStr + last + count;
			count = 0;
			if(j<str.length()){
				last = str.charAt(j);
			}
		
		}
		System.out.println(myStr);
		
		
		
	}

}
