package com.leetcode.stringsnarrays;
/*
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.

Note:
You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
https://leetcode.com/problems/shortest-word-distance/description/
 */
public class ShortestWordDistance {
	   public int shortestDistance(String[] words, String word1, String word2) {
	        int lastIndex = -1;
	        int min_distance = words.length;
	        
	        for(int i = 0; i<words.length; i++){
	            if(words[i].equals(word1)||words[i].equals(word2)){
	            	if(lastIndex != -1 && !words[lastIndex].equals(words[i])){
		            	min_distance = Math.min(min_distance, i-lastIndex);
	            	}
                   lastIndex = i;	            	
	            }
	        }
			return min_distance;	        
	    }
}
