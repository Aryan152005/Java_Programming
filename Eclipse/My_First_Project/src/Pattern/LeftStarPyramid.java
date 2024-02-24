package Pattern;

public class LeftStarPyramid {
	public static void main(String[] args) {
		for(int row = 1; row<4; row++) {
			for(int col = 0; col<row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
