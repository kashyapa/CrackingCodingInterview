package com.leetcode.stringsnarrays;

public class ReverseWords {
	public String reverseWords(String s) {
        if(s.equals(" ")) return "";
        
        char[] ch = s.toCharArray();
        int end=0, start =0;
   
        reverse(ch,0,ch.length-1);   
        while(end<ch.length){           
            while(end<ch.length && ch[end]!=' ') end++;            
            reverse(ch, start, end-1);
            while(end<ch.length && ch[end]==' ') end++;
            start=end;
        }
        int endIndex = removeExtraSpaces(ch);
        s=new String(ch);
        
        return s.substring(0, endIndex-1);
    }
    private static int removeExtraSpaces(char[] ch){
        int write=0;
        boolean keepSpace=true;
        for (int i=0; i<ch.length; i++){
            if(ch[i]!=' '||keepSpace==true){
                ch[write++]=ch[i];
                keepSpace=true;
                if(ch[i]==' '){
                    keepSpace = false;
                }  
            }
        }
        return write;
    }
    public void reverse(char[] ch, int start, int end){
        while(start<end){
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;
            start++; end--;
        }
        return;
    }
    public static void main(String[] args){
    	System.out.println(new ReverseWords().reverseWords("  a   b  c d   e          "));
    }
}
