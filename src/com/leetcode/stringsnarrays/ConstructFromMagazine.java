package com.leetcode.stringsnarrays;

import java.util.HashMap;

public class ConstructFromMagazine {
	public boolean isConstructibleFromMagazine(String ransom, String magazine){
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c:magazine.toCharArray()){
			int count = map.getOrDefault(c, 0);
			map.put(c, count+1);
		}
		
		for(char c: ransom.toCharArray()){
			int count = map.getOrDefault(c, 0);
			if(count==0){
				return false;
			}
			if(count==1)map.remove(c);
			else{
				map.put(c, count-1);				
			}
		}		
		return true;
	}
}
