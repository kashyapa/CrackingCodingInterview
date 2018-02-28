package com.leetcode.stringsnarrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumProductThreeNums {
    public int maximumProduct(int[] nums) {
        PriorityQueue minHeap = new PriorityQueue();
        PriorityQueue maxHeap = new PriorityQueue(Collections.reverseOrder());
        
        for(int i=0; i<nums.length;i++){
            minHeap.offer(nums[i]);
            maxHeap.offer(nums[i]);
            if(minHeap.size()>3){
                minHeap.poll();
            }
            if(maxHeap.size()>2){
                maxHeap.poll();
            }
        }
        int res=1;
        int res_neg = 1;
        int[] max_three = new int[3];
        int j=max_three.length;
        while(minHeap.size()!=0){
        	max_three[j-- -1]=(int)minHeap.poll();
        }
        
        int[]min_two = new int[2];
        min_two[1] = (int)maxHeap.poll();
        min_two[0] = (int)maxHeap.poll();
        		
        int maxVal = (int)minHeap.poll();
        res_neg*=maxVal;
        
        for(int i=0; i<2; i++){
            res_neg *= (int)maxHeap.poll();
        }

        
        res*=maxVal;
        for(int i=0;i<2;i++){
            int val = (int)minHeap.poll();
            res*=val;
        }
        return Math.max(res, res_neg);
    }
    public static void main(String[] args){
    	new MaximumProductThreeNums().maximumProduct(new int[]{-4,-3,-2,-1,60});
    }
}
