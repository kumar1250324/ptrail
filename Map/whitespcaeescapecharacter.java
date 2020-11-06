import java.util.*;

class whitespaceremover{
	public static void main(String[] args){
		String str= "my name 	is mohit	kumar"; //the string comprises of whitespaces of two types space and tab
		//Inbuilt methods.
		
		//str = str.replaceAll("\\t",""); //removes only white space created by tab;
		//str=str.replace(" ",""); //removes only whitespace by space key
		//str = str.replaceAll("\\s", ""); //remove all escape character(spaces by tab and space key);
		
		
		//method 2 without inbuilt function
		
		char[] y = str.toCharArray();
		StringBuffer stb = new StringBuffer(); //StringBuffer and StringBuilder are the two methods in java which allows string to mutable or in other word concat.
		int size = str.length();
		for(int i=0;i<size;i++){
			if((y[i]!=' ' )&& (y[i]!='\t')){
				stb.append(y[i]);
			} 
		}
		System.out.println(stb);
	
	
	}
}
