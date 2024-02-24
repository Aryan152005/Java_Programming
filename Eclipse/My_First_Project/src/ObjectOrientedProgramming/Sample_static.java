package ObjectOrientedProgramming;

public class Sample_static {
	public static void main(String[] args) {
		Static_variable_demo canteen = new Static_variable_demo();
		canteen.setCollegeName("SIT");
		String Cname = canteen.getCollegeName();
		System.out.println(Cname);
		Static_variable_demo library = new Static_variable_demo();
		library.setCollegeName("Symbiosis institute of technology");
		String Lname = library.getCollegeName();
		System.out.println(Lname);
	}

	}
