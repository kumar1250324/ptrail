import java .util.*;

class onlyintegerinstring{
 	public static void main(String[] args){
 		String str = "5032i4";
 		int size= str.length();
 		int i=0;
 		while(i!=size){
 			if(str.charAt(i) >='0' && str.charAt(i) <='9'){
 				i++;
 			}else{
 				System.out.println("not pure digit");
 				return ; //System.exit(0);
 			}
 		}
 		System.out.println("Pure Digits");
 		
 	
 	
 	
 	}



}
