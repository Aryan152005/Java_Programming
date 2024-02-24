package ObjectOrientedProgramming;

public class Student {
	private int rollno; //Instance variable
	private String name; //Instance variable
	private String branch; //Instance variable
	public void setStudent(int roll,String name1 ,String branch1) {
		rollno = roll;
		name = name1;
		branch = branch1 ;
	}
	public void getStudent() {
		System.out.println("Roll No = "+rollno);
		System.out.println("Name = "+name);
		System.out.println("Branch = "+branch);
	}
	public int getRollno() {
		return rollno;
	}	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}