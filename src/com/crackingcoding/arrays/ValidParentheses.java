package com.crackingcoding.arrays;

import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s){
		
		HashMap map = new HashMap(){{
			put('{','}');
			put('[',']');
			put('(',')');
		}};
		Stack stack = new Stack();
		
		
		for(char c: s.toCharArray()){
			if(map.containsKey(c)){
				stack.push(c);				
			}
			else if(map.values().contains(c)){
				char val = (char) stack.peek();
				if((char)map.get(val)!=c){
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
		
	}

}
