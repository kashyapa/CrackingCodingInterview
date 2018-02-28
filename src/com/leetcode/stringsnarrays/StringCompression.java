package com.leetcode.stringsnarrays;

public class StringCompression {
	public int compress(char[] chars){

		String str = new String(chars);
		int count=0;
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<str.length(); i++){
			count++;
			if(i+1==str.length() || str.charAt(i)!=str.charAt(i+1)){
				sb.append(str.charAt(i));
				if(count>1){
					sb.append(count);
				}
				count=0;
			}
		}

		return sb.toString().length();

	}
	
	public static void main(String[]args){
		new StringCompression().compress(new char[]{'a','a','b','b','c','c','c'});
	}
}
