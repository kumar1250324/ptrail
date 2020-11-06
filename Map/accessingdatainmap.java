import java.util.*;

class accessingdatainmap{
	public static void main(String[] args){
		String str = "mohhiiiit";
		char[] y = str.toCharArray();
		int size = str.length();
		
		//Map<Character,Integer> mapv = new HashMap<>();
		Map<Character,Integer> mapv = new LinkedHashMap<>(); // for getting first non repeated charcter;
		int i=0;
		//putiing data in hashmap
		while(i!=size){
			if(mapv.containsKey(y[i])==false){
				mapv.put(y[i],1);
			}else{
				int oldval=mapv.get(y[i]);
				int newval =oldval+1;
				mapv.put(y[i],newval);
			}
			i++;
		}
		
		Set<Map.Entry<Character,Integer>> hmap = mapv.entrySet();
		for(Map.Entry<Character,Integer> datav : hmap){
			System.out.print(datav.getKey());
			System.out.println(datav.getValue());
		}
		
		/*System.out.println("ALL Unique Character logic ");
		for(Map.Entry<Character,Integer> datav : hmap){
			if(datav.getValue()>1){
			System.out.println("not unique string");
			return ;}
						
		}
		System.out.println("All unique charcter");*/
		
		System.out.println("Duplicate character");
		for(Map.Entry<Character,Integer> datav : hmap){
			if(datav.getValue()>1){
			System.out.println(datav.getKey());}
			
		}
		
		System.out.println("NON Duplicate character");
		for(Map.Entry<Character,Integer> datav : hmap){
			if(datav.getValue()<=1){
			System.out.println(datav.getKey());}
			
		}
		
		System.out.println("Maximum occuring character");
		int max=0;
		char r='b';
		for(Map.Entry<Character,Integer> datav : hmap){
			if(datav.getValue()>max){
				max=datav.getValue();
				r=datav.getKey();
			}
			
		}
		System.out.println(max + " key  " + r);
		
		//using linkedhashmap for this.
		
		/*System.out.println("first NON Duplicate character");
		for(Map.Entry<Character,Integer> datav : hmap){
			if(datav.getValue()==1){
			System.out.println(datav.getKey());
			return ;}
			
		}*/
		
		//using linkedhashmap for this.
		
		/*System.out.println("first Duplicate character");
		for(Map.Entry<Character,Integer> datav : hmap){
			if(datav.getValue()>1){
			System.out.println(datav.getKey());
			return ;}
			
		}*/
		
		//use linkedhashmap
		System.out.println("removing duplicate characters");
		String res="";
		for(Map.Entry<Character,Integer> datav : hmap){
			
			res=res+datav.getKey();
			
			
		}
		System.out.println(res);
	
	}
}
