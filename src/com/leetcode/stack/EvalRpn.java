package com.leetcode.stack;

import java.util.HashSet;
import java.util.Stack;

public class EvalRpn {
	 Stack stack = new Stack();
     HashSet<String> operators = new HashSet(){{
     	add("+");
     	add("-");
     	add("/");
     	add("*");
     }};
	public int evalRPN(String[] tokens) {
       
		int res = Integer.parseInt((tokens[0]));

        for(int i=0; i<tokens.length; i++){
        	if(operators.contains(tokens[i])){
        		if(stack.size()>2){
            		int a = (int) stack.pop();
            		int b = (int) stack.pop();
            		switch(tokens[i]){
            			case "+": 
            				res = a+b; break;
            			case "-":
            				res = a-b; break;
            			case "*":
            				res = a*b; break;
            			case "/":
            				res = a/b; break;
            		}
            		stack.push(res);
            		continue;        			
        		}
        	}else{
            	stack.push(Integer.parseInt(tokens[i]));       		
        	}
        }
        return (int) stack.pop();
    }
}
