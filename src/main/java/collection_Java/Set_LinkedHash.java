package collection_Java;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHash {

	public static void main(String[] args) {
		
		//LinkedHashSet- Maintain Input order
		
		Set<Integer>num= new LinkedHashSet<Integer>();
		

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(100);
		num.add(50);
		
		System.out.println(num);
		System.out.println(num.size());
		System.out.println(num.contains(50));
		System.out.println(num.isEmpty());
		
		num.add(60);
		num.remove(50);
		
		System.out.println(num.size());
		
		for(Integer eachnumber:num) {
			System.out.println(eachnumber);
		}
		
		num.clear();
		System.out.println(num.isEmpty());

		}

	


	

}
