package BasicPrograms;
public class pattern {
	public static void main(String[] args) {
		for(int row = 0; row < 3; row++) {
			for(int columns = 0; columns <= row; columns++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
