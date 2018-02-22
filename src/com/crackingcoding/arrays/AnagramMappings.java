package com.crackingcoding.arrays;

import java.util.HashMap;

public class AnagramMappings {
	public int[] anagramMappings(int[] A, int[] B) {
        HashMap map = new HashMap();
        addMappings(B, map);
        int[] result = new int[A.length];
        int index = 0;
        
        for(int key : A){
            result[index++] = (int) map.get(key);
        }
        return result;
    }
    public static void addMappings(int[] nums,HashMap<Integer, Integer> map){
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        return;
    }
}
