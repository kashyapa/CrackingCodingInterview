package com.crackingcoding.arrays;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
/*        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();*/
      
        System.out.println(encrypt("hellowyzx"));
    }
    private static String encrypt(String s){
      StringBuilder sb = new StringBuilder();
      char ch;
      for(int i = 0; i<s.length(); i++){
        
        if((int)(s.charAt(i)) >= (int)'a' &&  
           (int) s.charAt(i) <= (int)'z'){
           ch = (char) (s.charAt(i) +2);
           if(ch > (int)'z'){
            ch = (char) (ch - 'z'+'a');
          }	
           	sb.append(ch);
             //sb.setCharAt(i, (char)ch);
        }
        if((int) s.charAt(i) >= (int)'A' &&  
           (int)(s.charAt(i)) <= (int)('Z')){
           ch = (char) (s.charAt(i)+2);
           if(ch >Character.getNumericValue('Z')){
            ch = (char) (ch - 'Z'+'A');
          }
          	sb.append(ch);
        }
        
      }
      return sb.toString();
    }
}

