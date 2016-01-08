package com.crackingcoding.arrays;

public class reverseCharacters {
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		String strng = "Sharat is a don";
		char []str = strng.toCharArray();
		
		System.out.println(str);
		int i, j;
		char temp;
		i = 0; 
		j = str.length-1;
		swap(str,i,j);
		System.out.println(str);
		i=0;
		j=0;
		while(j<str.length){
			while(j < str.length && str[j] != ' '){
				System.out.println(j + ", " + str[j]);
				j++;				
			}
			swap(str, i, j-1);
			j++;
			i=j;	
		}
	}
	public static void swap(char[] str, int i, int j){
		char temp;
		
		for(; i<j; i++, j--){
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			System.out.println(str);
		}	
		
	}
}
