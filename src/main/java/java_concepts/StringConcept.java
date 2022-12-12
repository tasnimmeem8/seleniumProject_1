package java_concepts;

public class StringConcept {

	public static void main(String[] args) {
	
		String txt1="There";
		String txt2="was";
		String txt3="a";
		String txt4="brown";
		String txt5="  crow";
		
		System.out.println(System.identityHashCode(txt1));
		System.out.println(System.identityHashCode(txt2));
		System.out.println(System.identityHashCode(txt3));
		System.out.println(System.identityHashCode(txt4));
		
		System.out.println(txt1==txt2);
		
		System.out.println(txt1.equals(txt4));
		
		System.out.println(txt1+" ".concat(txt2+" ".concat(txt3+" ".concat(txt4.concat(txt5)))));
		
		System.out.println(txt5.trim());
		System.out.println(txt1.contains("h"));
		System.out.println(txt1.isEmpty());
		System.out.println(txt1.length());
		System.out.println(txt1);
		System.out.println(txt1.toUpperCase());
		System.out.println(txt2.toLowerCase());

	}

}
