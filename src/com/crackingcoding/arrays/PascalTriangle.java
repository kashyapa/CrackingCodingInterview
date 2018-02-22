package com.crackingcoding.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	 public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> rows = new ArrayList();
            List<Integer> row, pre = null;

	        for(int i=0; i<numRows; i++){
	            row = new ArrayList<Integer>();
	            for(int j=0; j<i; j++){
	               if(j==0||j==i){
	            	   row.add(1);
	               }
	               else{
	            	   row.add(pre.get(j)+pre.get(j-1));
	               }
	            }
	            pre = row;
	            rows.add(row);
	        }
			return rows;
	    }
}
