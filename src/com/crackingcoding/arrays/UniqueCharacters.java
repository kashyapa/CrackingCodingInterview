package com.crackingcoding.arrays;

import java.util.HashMap;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacters strObj = new UniqueCharacters();
		String str = "Follow up";
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int val;
		
		for (int i = 0; i < str.length(); i++){
			Character c = str.charAt(i);
			if (hmap.containsKey(c) ==  false){
				hmap.put(c, 1);
			}
			else{
				System.out.println("Has recurring character " + c);
			}			
		}
	}

}
