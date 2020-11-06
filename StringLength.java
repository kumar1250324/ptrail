import java.util.*;

class strprac{
	public static void main(String[] args){
		String str = "my name is mohit"; //In java string is consider as object;
		System.out.println(str.length()); // Inbuilt function to calculate length;
		
		//if we want to access char at certain point in java without converting to charArray
		
		System.out.println(str.charAt(4));
		
		//if we want to calculate without inbuilt function
		
		char x[] = str.toCharArray(); //here we have converted string into char of array;
		 System.out.println(x);
		 System.out.println(x[4]); //accesing char by index;
		 
		int count=0,scount=0;
		//if already string is converted into chararray
		for(char i:x){
			count++;
		}
		System.out.println(count); 
		
		//if string is not converted in char array
		 
		for(char i:str.toCharArray()){
			scount++;
		}
		System.out.println(scount); 
		
		///concat word at the end of string
		str = str.concat("cr");
		System.out.println(str); 
		 
		
	}
	
}
