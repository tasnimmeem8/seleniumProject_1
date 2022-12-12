package loop;

public class DoWhile_loop_String {

	public static void main(String[] args) {
		String[] obj = new String[6];
		obj[0] = "Atiq";
		obj[1] = "Meem";
		obj[2] = "Rosy";
		obj[3] = "Shafin";
		obj[4] = "Mamun";
		obj[5] = "xyz";
		
		int i=0;
		do{
			System.out.println(obj[i]);
			i++;
		}while (i<obj.length);

	}
}
