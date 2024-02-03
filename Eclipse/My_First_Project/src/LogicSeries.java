
public class LogicSeries {
	public static void main(String[] args) {
		int num1 = 5, num2 = 8;
		int result1, result2;
		for(int index = 1; index <= 10; index++) {
			result1 = num1*index;
			result2 = num2*index;
			System.out.print(result1+" "+result2+" ");
		}
	}
}
