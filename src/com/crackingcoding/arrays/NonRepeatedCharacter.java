package com.crackingcoding.arrays;

import java.util.HashMap;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "teeter";
		HashMap <Character, Integer> hmap = new HashMap<Character, Integer>();
		Character c;
		int count=0;
		for (int i=0; i < str.length(); i++){
			c = new Character(str.charAt(i));
			if (hmap.containsKey(c)){
				count = hmap.get(c);
				hmap.put(c, ++count);		
			}
			else{
				hmap.put(c, 1);
			}
		}
		for(int i=0; i<str.length(); i++){
			c = new Character(str.charAt(i));
			if (hmap.get(c) == 1){
				System.out.println(c);
				return;
			}
		}
	}

}
