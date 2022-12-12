package java_concepts;

public class DataType {

	public static void main(String[] args) {
		
	//	primitive dataType
		
		int num= 1;
		short num1=11;
		float num2=2.2f;
		double num3=22.11;
		
		char sim ='M';
		boolean status =true;
		
		
	//non primitive dataType (String, Arrays, Classes and Interfaces)
		
		String name= "Meem";
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(sim);
		System.out.println(status);
		System.out.println(name);
		
		//converting double to int
		int num4 =(int)num3;{
			System.out.println(num4);
		}
		
		//converting float to int
		int num5 =(int)num2;{
			System.out.println(num5);
		}
		
	}

}
