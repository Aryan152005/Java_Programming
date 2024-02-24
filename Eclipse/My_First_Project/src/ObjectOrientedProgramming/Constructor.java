package ObjectOrientedProgramming;

public class Constructor {
	private float rate;
	private String name;
	private long phone;
	public Constructor() {
		this.rate = 9.10f;
		this.name = "value is not available";
		System.out.println("rate "+rate);
		System.out.println("Name "+name);
		System.out.println("Inside Default constructor of class Const");
	}
	public Constructor(float rate ,String name) {
		this.rate = rate;
		this.name = name;
		System.out.println("Inside Parameterized constructor of class Const");
	}
	public void Constget() {
		System.out.println("rate "+rate);
		System.out.println("Name "+name);
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10.11f,"Aryan");
		c1.Constget();
		c2.Constget();
	}
}