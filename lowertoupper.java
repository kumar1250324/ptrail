//A=65 a=97 difference =32;

import java.util.*;
class lowertoupper{
	public static void main(String[] args){
		/*String str = "mohit";
		char a[] = str.toCharArray();
		int size= str.length();
		int i=0;
		while(i!=size){
			a[i]=(char)(a[i]-32); // if upper to lower then a[i]=(char)(a[i]+32);
			i++;
			
		}
		System.out.println(a);*/
		
		//case str = "mohit kumar from haryana" have space betwwen them
		String str = "mohit kumar from Haryana";
		char a[] = str.toCharArray();
		int size= str.length();
		int i=0;
		while(i!=size){
			if(a[i]!=' ' && a[i]>='a' && a[i]<='z'){
			a[i]=(char)(a[i]-32);
			}
			i++;
		}
		System.out.println(a);
		
	
	
	}
}
