package collection_Java;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map_Tree {

	public static void main(String[] args) {
		
		//TreeMap- From low to high , for string follow alphabetic order
		Map<String, Integer>sub= new TreeMap<String, Integer>();
		
		sub.put("English", 90);
		sub.put("Math", 99);
		sub.put("Physics", 89);
		sub.put("Bangla", 100);
		
		System.out.println(sub);
		
		for (Entry<String, Integer>eachsub:sub.entrySet()) {
			System.out.println(eachsub.getKey()+" "+eachsub.getValue());
			
		}
		

	}

}
