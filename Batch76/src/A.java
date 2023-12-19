
public class A {

	//initialization block
	{
		System.out.println("This is initialization block");
	}
	
	A()
	{
		System.out.println("This is constructor");
	}
	
	static 
	{
		System.out.println("This is Static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main block start to execute");
		A obj = new A();
		System.out.println("Welcome to Java");
	}
}
