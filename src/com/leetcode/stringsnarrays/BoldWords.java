package com.leetcode.stringsnarrays;
/*
 * https://leetcode.com/problems/bold-words-in-string/description/
 * Given a set of keywords words and a string S, make all appearances of all keywords in S bold. Any letters between <b> and </b> tags become bold.

The returned string should use the least number of tags possible, and of course the tags should form a valid combination.

For example, given that words = ["ab", "bc"] and S = "aabcd", we should return "a<b>abc</b>d". Note that returning "a<b>a<b>b</b>c</b>d" would use more tags, so it is incorrect.
 */
public class BoldWords {
	  public String boldWords(String[] words, String s){
			boolean []marked = new boolean[s.length()];
			for(String word: words){
				markWords(word, marked, s);
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i< s.length(); i++){
				if( marked[i] && (i==0 || !marked[i-1])){
					sb.append("<b>");
				}
					sb.append(s.charAt(i));
				if(marked[i]&&(i==s.length()-1 || !marked[i+1])){
					sb.append("</b>");
				}
			}
			return sb.toString();
		}

		private void markWords(String word, boolean[] marked, String s) {
			// TODO Auto-generated method stub
			for(int i=0; i<s.length()-word.length(); i++){
				String substr = s.substring(i, i+word.length());
				if(substr.equals(word)){
					for(int j=i; j<i+word.length();j++){
						marked[j] = true;
					}
				}
			}
		}
}
