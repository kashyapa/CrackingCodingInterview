package com.crackingcoding.arrays;

public class PalindromeFinder {

	    public boolean isPalindrome(String s) {
	        int i = 0;
	        int j = s.length()-1;
	        while(i<j){
	            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))){
	                if(s.charAt(i)!=s.charAt(j)) return false;
	                i++; 
	                j--;
	            }
	            else{
	                while(!Character.isLetterOrDigit(s.charAt(i))) i++;
	                while(!Character.isLetterOrDigit(s.charAt(j))) j--;
	            }
	        }
			return true;
	    }
	    public void main(String[] args){	    	
	    	 if(new PalindromeFinder().isPalindrome("A man, a plan, a canal: Panama")){
	    		 System.out.println("palindrome pass");
	    	 }
	    	 else{
	    		 System.out.println("not a palindrome");
	    	 }
	    }
}
