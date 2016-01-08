package com.crackingcoding.arrays;

public class StrtoInt {

	public StrtoInt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StrtoInt().ConvertStringToInteger("4325");

	}

	private void ConvertStringToInteger(String string) {
		// TODO Auto-generated method stub
		
		char[] ch = string.toCharArray();
		int len = string.length();
		int n = 0;
		for(int i=0;i<len;i++){
			n = n*10+ (ch[i]-'0');
		}
		System.out.print(n);
	}

}
