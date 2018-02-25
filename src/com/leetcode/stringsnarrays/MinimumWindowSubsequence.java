package com.leetcode.stringsnarrays;
/*
 * Given strings S and T, find the minimum (contiguous) substring W of S, so that T is a subsequence of W.

If there is no such window in S that covers all characters in T, return the empty string "". If there are multiple such minimum-length windows, return the one with the left-most starting index.

Example 1:
Input: 
S = "abcdebdde", T = "bde"
Output: "bcde"
Explanation: 
"bcde" is the answer because it occurs before "bdde" which has the same length.
"deb" is not a smaller window because the elements of T in the window must occur in order.
Note:

All the strings in the input will only contain lowercase letters.
The length of S will be in the range [1, 20000].
The length of T will be in the range [1, 100].
https://leetcode.com/problems/minimum-window-subsequence/description/
 */
public class MinimumWindowSubsequence {
    public String minWindow(String S, String T) {
		int left=0, right=0;
		int t_len = T.length();
		int s_len = S.length();
		int min_window= Integer.MAX_VALUE;
		int window_start=0;
		int window_end=0;
		
		for(int i=0; i<=s_len-t_len; i++){
			if(S.charAt(i)==T.charAt(0)){
				int j = i;
				int count = t_len;
				while(j<s_len){
					if(S.charAt(j++)==T.charAt(t_len-count)){
						count--;
					}
					//All character are present within window if count==0
					if(count==0) {
						if(j-i<min_window){
							// store the window indices if they're lesser than current window length
							window_start=i;
							window_end=j;
						}
						min_window=Math.min(j-i,min_window);
						break;
					}
				}
			}
		}
		if(window_start==window_end)window_end++;
    	return S.substring(window_start, window_end);       
    }
    public static void main(String[] args){
    	System.out.println(new MinimumWindowSubsequence().minWindow("jmeqksfrsdcmsiwvaovztaqenprpvnbstl", "l"));
    }
}
