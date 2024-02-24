package BasicPrograms;
public class fibonacci {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
		for(int index = 0; index<= 10; index++) {
			System.out.print(num1+" ");
			int temp = num1;
			num1 = num2;
			num2 = temp + num2;
		}
	}
}
