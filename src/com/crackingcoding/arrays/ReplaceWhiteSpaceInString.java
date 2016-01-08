package com.crackingcoding.arrays;

public class ReplaceWhiteSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0 , j= 0;
		int spaceCount=0;
		String str = "Mr John Smith       ";
		
		char [] chrArray = str.toCharArray();
		j = str.length()-1;
		/*for(i=0;i < j; i++){
			if (chrArray[i] == ' '){
				spaceCount++;
			}
		}*/

		//chrArray[j+spaceCount*2] = '\0';
		System.out.println(chrArray);
		while(j >= 0 && chrArray[j] == ' '){
			System.out.println(j);
			j--;
		}
		i = str.length() - 1;
		
		while(j>=0){
			if (chrArray[j] == ' '){
				chrArray[i--] = '0';
				chrArray[i--] = '2';
				chrArray[i--] = '%';
						
			}
			else{
				chrArray[i--] = chrArray[j];
			}
			j--;			
		}
		while(i>=0){
			chrArray[i--] = ' ';
		}
		//Convert char array to string		
		str = String.valueOf(chrArray);
		str = str.trim();
		System.out.println(str);
	}

}
