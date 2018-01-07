package com.crackingcoding.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuildSubSequences {

	
	 /* Complete the function below.
	 */
	static List res = new ArrayList();
	static String[] buildSubsequences(String str){
		if(str != null && str.length()!=0)
			
			RecCombine("",str);
		String[] result = new String[res.size()];
		for(int i=0; i< res.size(); i++){
			result[i]  = (String) res.get(i);
			System.out.println(result[i]);
		}
		Arrays.sort(result);
		return result;
	}
	
	static void RecCombine(String prefix,String rest){
		if(rest.length() == 0)
			res.add(prefix);
		else{
			RecCombine(prefix + rest.charAt(0),rest.substring(1));
			RecCombine(prefix,rest.substring(1));
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildSubSequences.buildSubsequences("abc");
	}

}
