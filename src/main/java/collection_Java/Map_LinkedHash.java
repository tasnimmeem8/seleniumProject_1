package collection_Java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_LinkedHash {

	public static void main(String[] args) {
		//LinkedHashMap- follow sequence as entered
		Map<String, Integer>sub= new LinkedHashMap<String, Integer>();
		
		sub.put("Bangla", 100);
		sub.put("English", 90);
		sub.put("Math", 99);
		sub.put("Physics", 89);
		
		System.out.println(sub);
		
		for (Entry<String, Integer>eachsub:sub.entrySet()) {
			System.out.println(eachsub.getKey()+" "+eachsub.getValue());
			
		}
		
		

	}

}
