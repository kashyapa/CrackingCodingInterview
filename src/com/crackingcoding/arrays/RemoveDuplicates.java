package com.crackingcoding.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Follow up";
		int count=0;
		char []chArray = str.toCharArray();
		int tail =1; 							//Index upto which all characters are unique
		//chArray[chArray.length-1] = '\0';
		int j =0;
		for(int i = 1; i<chArray.length; i++){
			for( j = 0; j < tail; j++){		//Check if chArray[i] is present in the list of unique characters upto tail
				if(chArray[j] == chArray[i]){	//If present, break out of inner for loop
					break;
				}			
			}
			if (j == tail){ 					//If j == tail, charArray[i] was not present chArray[0...tail] 
				chArray[tail] = chArray[i];		//Hence add charArray[i]  to charArray[tail]
				tail++;
			}	
		}
		//chArray[tail] = '\0';
		System.out.println(chArray);

	}
}
