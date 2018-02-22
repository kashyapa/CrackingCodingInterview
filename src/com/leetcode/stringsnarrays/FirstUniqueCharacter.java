package com.leetcode.stringsnarrays;

import java.util.LinkedHashMap;

public class FirstUniqueCharacter {
	static class CharacterIndex{
    	int count;
    	int index;
    }
	public int firstUniqChar(String s) {
        LinkedHashMap<Character, CharacterIndex>map = new LinkedHashMap<>();
        int index=0;
        for(char c: s.toCharArray()){
            CharacterIndex count = map.getOrDefault(c, null);
            if(count ==null){
            	count = new CharacterIndex();

            }
            count.count++;
            count.index= index++;
            map.put(c, count);
        }
        index=0;
        for(char c: map.keySet()){    
        	CharacterIndex ci = (CharacterIndex)map.get(c);
        	
            if(ci.count==1)
                return ci.index; 
            
            index++;
        }

        return -1;
    }
	public static void main(String[] args){
		System.out.println(new FirstUniqueCharacter().firstUniqChar("leetcode"));
	}
}
