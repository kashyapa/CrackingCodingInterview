package com.crackingcoding.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        for (Character c : s.toCharArray()){
        	if(Character.isUpperCase(c)){
        		count++;
        	}
        }
        System.out.println(count+1);
    }
}