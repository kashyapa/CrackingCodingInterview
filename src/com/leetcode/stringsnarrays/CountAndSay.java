package com.leetcode.stringsnarrays;

public class CountAndSay {
	public static String countAndSay(int n) {
		StringBuilder sb = new StringBuilder();
        sb.append(1);
        int count = 0;
        for(int i = 1; i<n; i++){
        	String s = sb.toString();
        	sb.setLength(0);
            for(int j=0;j <s.length();j++){
            	count++;
            	if(j+1==s.length()||s.charAt(j)!=s.charAt(j+1)){
            		sb.append(count);
            		sb.append(s.charAt(j));
            		count=0;
            	}            	
            }    
        }
		System.out.println(sb.toString());
		return sb.toString();
		
	}
	public static void main(String[] args){
		new CountAndSay().countAndSay(5);
	}
}
