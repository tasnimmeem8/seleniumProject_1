package collection_Java;

import java.util.HashSet;
import java.util.Set;

public class Set_Hash {

	public static void main(String[] args) {
		//Hash random
		Set<Integer>number=new HashSet<Integer>();
		
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(10);
		
		System.out.println(number);
		System.out.println(number.contains(100));
		System.out.println(number.isEmpty());
		number.add(400);
		for(Integer eachnumber:number) {
			System.out.println(eachnumber);
		}
		number.clear();
		System.out.println(number.isEmpty());
		

	}

}
