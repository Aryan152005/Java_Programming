package BasicPrograms;
public class tableOfTwo {
	public static void main(String[] args) {
		int key = 5;
		int result;
		for(int index = 0; index <= 10; index++) {
			result = key * index;
			System.out.println(key+" * "+index+" = "+result);
		}
	}
}