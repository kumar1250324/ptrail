import java.util.*;

class copyreverse{
	public static void main(String[] args){
	 String str ="my name is mohit";
	 int size = str.length();
	 char a[] = str.toCharArray();
	 //copy a string
	 int i=0;
	 char y[] = new char[size]; 
	 while(i!=size){
	 	y[i]=a[i];
	 	i++;
	}
	System.out.println(y);
	System.out.println(a);
	
	//Reverse the string 
	char rev[] =new char[size];
	i=0;
	while(i!=size){
		rev[size-i-1]=a[i]; //different form copy rev[size-i-1] by y[i];
		i++;
	}
	System.out.println(rev);
	}
}
