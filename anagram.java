//anagram is a string which have same no of characters and same charcter bt arranged differently or same;

import java.util.*;
 class anagram {
 	public static void main(String args[]){
 		String str = "mohit";
 		String str2= "tohim";
 		char[] x = str.toCharArray();
 		char[] y = str2.toCharArray();
 		//System.out.println(x);
 		//System.out.println(y);
 		Arrays.sort(x);
 		Arrays.sort(y);
 		//System.out.println(x);
 		//System.out.println(y);
 		int size1=str.length();
 		int size2=str2.length();
 		if(size1!=size2){
 		 	System.out.println("not anagram");
 			return ;
 		}
 		int i=0;
 		while(i!=size1){
 			if(x[i]!=y[i]){
 				System.out.println("not 2 anagram");
 				return ;
 		 		}
 		 	else{
 		 	i++;
 		 	}
 		}
 		System.out.println("anagram");
 		
 	}
 }
 
 
