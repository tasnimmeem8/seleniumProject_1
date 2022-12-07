package collection_Java;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

public class Map_Hash {

	public static void main(String[] args) {
		
		
		//Hash map - ramdom order
		Map<Integer, Integer>num= new HashedMap<Integer, Integer>();
		
		num.put(100, 200);
		num.put(20, 50);
		num.put(30, 300);
		
		System.out.println(num);
		System.out.println(num.size());
		System.out.println(num.isEmpty());
		
		num.put(60,60);
		num.remove(50);
		
		System.out.println(num.size());
		
		for(Entry<Integer, Integer> eachnum:num.entrySet()) {
			System.out.println(eachnum);
		}
		
		for(Entry<Integer, Integer> eachnum:num.entrySet()) {
			System.out.println(eachnum.getValue()+"  "+eachnum.getKey());
		}
	
		num.clear();
		System.out.println(num.isEmpty());
		

		
		
		

	}

}
