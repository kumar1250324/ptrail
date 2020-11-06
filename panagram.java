import java.util.*;
 class panagram{
 	public static void main(String[] args){
 		String str ="The quick brown fox jumps over the lazy dog"; 
 		str = str.replace(" ","" ); //replace blank space with empty string
 		str = str.toLowerCase(); //Convert all the character to lower case;
 		/*int a[]=new int[26];
 		for(int i=0;i<26;i++){
 			a[i]=0;
 		}
 		for( i=0;i<26;i++){
 			System.out.println(a[i]);
 		}*/
 		
 		//Using inbuilt method;
 		int a[] = new int[26];
 		Arrays.fill(a, 0);
 		
 		int size = str.length();
 		
 		/*if(size<26){
 			return ;
 		}*/
 		 char y[]=str.toCharArray();
 		 int i=0,index;
 		 while(i!=size){
 		 	index=y[i]-'a';
 		 	a[index]++;
 		 	i++;
 		 }
 		 for(i=0;i<26;i++){
 			System.out.print(a[i]);
 		}
 		i=0;
 		while(i!=26){
 			if(a[i]==0){
 				System.out.println("Not a panagram");
 				return ;
 			}
 			i++;
 		}
 		System.out.println("panagram string");
 		
 		
 		
 			
 		
 		
 	}
 }
