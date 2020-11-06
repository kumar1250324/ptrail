import java.util.*;
 class firstLetterUpper{
 	public static void main(String[] args){
 		String str = "my naMe is mohit kumar";
 		int size = str.length();
 		char a[] = str.toCharArray();
 		int i=0;
 		while(i!=size){
 			if((i==0 && a[i]!=' ') || (a[i]!=' ' && a[i-1]==' ')){ //condition check whther it is first character or it is character just after space
 				if(a[i]>='a' && a[i]<='z'){
 					a[i]=(char)(a[i]-'a'+'A');
 				}
 			}else if(a[i]>='A' && a[i]<='Z') {
 				a[i]=(char)(a[i]+'a'-'A');
 			}
 			i++;
 		}
 		System.out.println(a);
 	
 	
 	
 	}
 }
