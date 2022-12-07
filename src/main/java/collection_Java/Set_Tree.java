package collection_Java;

import java.util.Set;
import java.util.TreeSet;

public class Set_Tree {

	public static void main(String[] args) {
		//Tree -low to high
		Set<Integer>number= new TreeSet<Integer>();
		
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(10);
		
		System.out.println(number);
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
