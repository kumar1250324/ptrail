import java.util.*;
import java.lang.*;
 
class pallindrome{
	public static void main(String[] args){
		/*String str ="mymohitihomymr";
		char a[]= str.toCharArray();
		int size = str.length();
		int i=0;
		int end = (int)Math.ceil(size/2);// we are minimizing the loop;
		System.out.println(end);
		while(i!=end){
			if(a[i]!=a[size-i-1]){
				System.out.println("not pallindrome");
				return ;}
			i++;
		}
		System.out.println("pallindrome");*/
		
		//case 1: str =" to hot to hoot" problem here is empty spaces
		//so replace that blank space with empty string;
		
		/*String str1 ="too hot to hoot";
		str1 = str1.replace(" ","");
		System.out.println(str1);
		char a1[]= str1.toCharArray();
		int size1 = str1.length();
		int i=0;
		int end = (int)Math.ceil(size1/2);// we are minimizing the loop;
		System.out.println(end);
		while(i!=end){
			if(a1[i]!=a1[size1-i-1]){
				System.out.println("not pallindrome");
				return ;}
			i++;
		}
		System.out.println("pallindrome");*/
		
		//case2 : str = "too Hot to HOOT" prblm is space and case sensitive of char
		//soln : replace space with empty string (str.replace()) and case sensitive to upper(str.toUpperCase()) or lower (str.toLowerCase());
		String str2 = "too Hot to HOOT";
		str2 = str2.replace(" ","");
		str2 = str2.toUpperCase();
		System.out.println(str2);
		char a2[]= str2.toCharArray();
		int size2 = str2.length();
		int i=0;
		int end = (int)Math.ceil(size2/2);// we are minimizing the loop;
		System.out.println(end);
		while(i!=end){
			if(a2[i]!=a2[size2-i-1]){
				System.out.println("not pallindrome");
				return ;}
			i++;
		}
		System.out.println("pallindrome");
		
		
	
	}
}

