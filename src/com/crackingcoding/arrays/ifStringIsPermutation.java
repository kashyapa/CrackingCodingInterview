package com.crackingcoding.arrays;

import java.util.HashMap;

public class ifStringIsPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello world";
		String str2 = "World hello";
		int val;
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		Character c;
		if (str1.length()!=str2.length()){
			System.out.println("Two strings are not a permutation of each other");
			return;
		}
		
		for (int i = 0; i < str1.length(); i++ ){
			c  = new Character(str1.toLowerCase().charAt(i));
			if (hmap.containsKey(c)){
				val = hmap.get(str1.charAt(i));
				hmap.put(c , ++val);
			}else{
				hmap.put(c, 1);
			}
					
		}
		for (int i = 0; i < str2.length(); i++ ){
			c = new Character(str2.toLowerCase().charAt(i));
			if (hmap.containsKey(c) && hmap.get(c)!=0){
				val = hmap.get(c);
				hmap.put(c, --val);
			}
			else{
				System.out.println("String1 & 2 are not a permutation of each other");
				return;
			}
			
		}
		System.out.println("String 1 & 2 are permutation of each other");
	}
	

}
