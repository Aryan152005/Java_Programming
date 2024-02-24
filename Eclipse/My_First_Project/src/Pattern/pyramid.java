package Pattern;

public class pyramid {
	public static void main(String[] args) {
		for(int row = 0; row<4; row++) {
			for(int space = 3; space>row; space-- ) {
				System.out.print(" ");
			}
			for(int col = 0; col<=row; col++) {
				System.out.print("*");
			}
			for(int spc = 0; spc<row; spc++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
