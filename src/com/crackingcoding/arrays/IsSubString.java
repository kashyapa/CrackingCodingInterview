/*Assume you have a method isSubstring which checks if one word is a substring of another.
Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using 
only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
*/
package com.crackingcoding.arrays;

public class IsSubString {

	public IsSubString() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "try";
		String str2 = "trrrharderttttrrtryyyy";
		if(new IsSubString().CheckIfSubString(str1, str2)){
			System.out.println("It is a substring");
		}
		else{
			System.out.println("It is not");
		}
		
	}
	public boolean CheckIfSubString(String str1, String str2){
		
		char[] shorter = str1.toCharArray();
		char[] longer = str2.toCharArray();
		int len2 = longer.length, len1 = shorter.length;
		int indexWithoutMatch=0;
		int i = 0, j=0;
		while(indexWithoutMatch <= len2-shorter.length){
			j = indexWithoutMatch;
			while(shorter[i] != longer[j]){
				j++;
			}
			indexWithoutMatch = j;
			while(i<len1-1 && j<len2-1){
				System.out.println(longer[j] + " " + i + " ");
				 if((shorter[i] == longer[j])){
					 i++; j++;
				 }
				 else{
					 if(i<len1){
						i=0;
						indexWithoutMatch = j;
					}
				 }
			}	
			System.out.println(shorter);
			return true;
		}
		return false;	
	}
}
