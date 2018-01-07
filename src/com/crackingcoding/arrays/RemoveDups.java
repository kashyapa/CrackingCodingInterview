package com.crackingcoding.arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RemoveDups {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
      Scanner in  = new Scanner(System.in);
      String s = in.nextLine();
/*      char []ch = s.toCharArray();
      Arrays.sort(ch);
      s = new String(ch);*/
      //HashMap<Character, Integer>map = new HashMap();
      int[] map = new int [128];
      StringBuilder sb = new StringBuilder(); 
      int i=0;
      while(i < s.length()){ 
        map[s.charAt(i++)]++;
      }  
      for(i = 0;i<s.length(); i++){
              if(map[s.charAt(i)]%2 ==1){
            	  sb.append(s.charAt(i));
            	  map[s.charAt(i)] = 0;
              }
      }
      System.out.println(sb.toString());
    } 
}