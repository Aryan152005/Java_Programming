package ObjectOrientedProgramming;

public class A {
	int num; // Instance variable
	
	public static void main(String[] args) {
		A a1 = new A(); // Object/Instance
		A a2 = new A();
		a1.num = 10;
		a2.num = 20;
		
		System.out.println(a1.num);
		System.out.println(a2.num);
	}
}
