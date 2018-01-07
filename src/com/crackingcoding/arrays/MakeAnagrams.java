package com.crackingcoding.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MakeAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i< s.length(); i++){
			int c = 0;
			if(map.containsKey(s.charAt(i))){
				c = map.get(s.charAt(i));
			}
			map.put(s.charAt(i), c+1);
		}
		int count = 0;
		for(int i = 0; i< t.length(); i++){
			int c = 0;
			if(map.containsKey(t.charAt(i))){
				c = map.get(t.charAt(i));
				if(c==1){
					map.remove(t.charAt(i));
				}else{
					map.put(t.charAt(i), c-1);
				}
			}
			else{
				count++;
			}
		}
		System.out.println(count);
	}

}
