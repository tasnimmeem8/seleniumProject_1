package collection_Java;

import java.util.ArrayList;
import java.util.List;

public class List_Integer {

	public static void main(String[] args) {
		
	
		
		List<Integer>number= new ArrayList<Integer>();
		
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		
		System.out.println(number.size());
		System.out.println(number.contains(100));
		System.out.println(number.isEmpty());
		System.out.println(number);
		number.add(600);
		number.add(700);
		
		
		for(Integer eachnumber:number) {
			System.out.println(eachnumber);
		}
		
		number.clear();
		System.out.println(number.isEmpty());
		

	}

}
