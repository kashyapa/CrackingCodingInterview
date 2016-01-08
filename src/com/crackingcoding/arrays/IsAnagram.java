package com.crackingcoding.arrays;

import java.util.HashMap;

public class IsAnagram {

	public static void main(String[] args){
		if(new IsAnagram().FindAnagram()){
			System.out.println("It is an anagram");
		}
		else{
			System.out.println("Not an anagram");
		}
	}
	public boolean FindAnagram() {
		// TODO Auto-generated constructor stub
		String str1 = "mary";
		String str2 = "army";
		int len = str1.length();
		int count = 0;
		if(len!=str1.length()){
			System.out.println("not anagram");
			return false;
		}
		char[] chArray = str1.toCharArray();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < len; i++){
			Character ch = new Character(chArray[i]);
			if (hmap.containsKey(ch)){
				count = hmap.get(ch);
				hmap.put(ch, ++count);
			}
			else{
				hmap.put(ch, 1);
			}
		}
		len = str2.length();
		chArray = str2.toCharArray();
		count  =0;
		for(int i=0; i<len;i++){
			Character ch = new Character(chArray[i]);
			if(hmap.containsKey(ch) == false){
				return false;
			}
			else{
				count = hmap.get(ch);
				if(count == 0){
					return false;
				}
				count--;
				hmap.put(ch, count);
			}
		}
		return true;
		
	}

}
