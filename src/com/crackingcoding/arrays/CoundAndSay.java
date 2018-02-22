package com.crackingcoding.arrays;

class CountAndSay {
    public static String countAndSay(int n) {
        
        StringBuilder sb = null;
        if(n==0||n>=8)return null;
        int val = 1;
        int count = 1;
        if(n==1) return "1";
        
        while(n-->0){
            
            sb = new StringBuilder();
            String s = String.valueOf(val);
            count  = 1;
            char pre=s.charAt(0);
            for(int i = 1; i< s.length(); i++){
                char c = s.charAt(i);
                if(c!=pre){
                    sb.append(count+""+pre);
                    count =1;
                }
                else{
                    count++;
                }
                pre = c;
            }
            sb.append(count+""+pre);
            val = Integer.parseInt(sb.toString());
        }
        return sb.toString();
    }
    public static void main (String[] args){
    	countAndSay(1);
    }
}
