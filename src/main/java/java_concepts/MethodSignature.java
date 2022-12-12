package java_concepts;

public class MethodSignature {

	public static void main(String[] args) {
		
		MethodSignature obj = new MethodSignature();
		
		
		obj.driving();
		obj.driving();
		obj.driving();

		obj.color();
		obj.color();

		obj.horn();
		obj.horn();

		obj.mirror();
		obj.mirror();

		obj.add(10, 20);
	
		}
	public void driving() {
		
	}
	
	private void color() {
		System.out.println("Power break");
    }

	protected void horn() {
		System.out.println("Hydrolic horn");
	}
	
	void mirror() {
		System.out.println("Mirror in both side");
	}
	
	public int add (int a , int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public static int addNumber(int c,int d) {
		System.out.println(c+d);
		return c+d;
	}


	

}
