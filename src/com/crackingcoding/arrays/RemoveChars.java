package com.crackingcoding.arrays;

import java.util.HashMap;

public class RemoveChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Sharat Chandra");
		String removeChars = "chrdtns";
		String newString = new String();
		
		Character c;
		HashMap<Character, Boolean>hmap = new HashMap<Character, Boolean>();
		for (char ch: removeChars.toLowerCase().toCharArray()){
			c = new Character(ch);
			if (hmap.containsKey(c)==false){
				hmap.put(c, true);
			}
			
		}
		for(char ch:str.toLowerCase().toCharArray()){
			c = new Character(ch);
			if(hmap.containsKey(c) == false){
				newString = newString+c;
				System.out.println(c);
			}
		}
		System.out.println(newString);
	}

}
