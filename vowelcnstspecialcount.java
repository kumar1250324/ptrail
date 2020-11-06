import java.util.*;

class vowelsnstspecialcount{
	public static void main(String[] args){
		String str ="mohit kumar yadav is from @ Haryana";
		int size = str.length();
		str = str.toLowerCase();
		int i=0,vowelscnt=0,consonant=0,splchar=0;
		while(i!=size){
			if(str.charAt(i) >='a' && str.charAt(i)<='z'){
				if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o'|| str.charAt(i) =='u'){
					vowelscnt++;
				}else{
					consonant++;
				}
			}else{
				splchar++;
			}
			i++;
		}
		System.out.println(vowelscnt);
		System.out.println(consonant);
		System.out.println(splchar);
		
	
	
	}
}
