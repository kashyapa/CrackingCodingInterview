package com.crackingcoding.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        
        if(nums == null)
            return null;
        else if (nums.length==0){
            return new ArrayList<String>();
        }
        int pre = nums[0];
        int[] a = nums;
        int cur=a[0];
        List<String> ranges = new ArrayList<String>();
        for (int i = 1; i <nums.length; i++){
            cur = a[i];
            System.out.println(pre+ " : " + cur );
            if(Math.abs(a[i])-Math.abs(a[i-1])> 1){
                if(pre!=a[i-1]){
                    ranges.add(pre+"->"+a[i-1]);
                }
                else {
                    ranges.add(pre+"");
                }
                pre = cur;
            }
        }
        if(pre!=cur){
            ranges.add(pre+"->"+cur);
        }
        else {
            ranges.add(pre+"");
        }
        return ranges;    
    }
    public static void main(String[] args){
    	int[]nums = {-2147483648,-2147483647,2147483647};
    	new SummaryRanges().summaryRanges(nums);
    }
}