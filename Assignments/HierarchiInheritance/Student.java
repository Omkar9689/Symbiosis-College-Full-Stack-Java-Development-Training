package HierarchiInheritance;

public class Student extends Person{
	
	private int marks;
	private String div;
	
	public Student() {
		System.out.println("Default Constructor (Student)");
		this.marks= 11;
		this.div="calss a";
	}
	
	public Student(int marks,String div) {
		
		this.marks=marks;
		this.div=div;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}
	
	public String toString() {
		return "Student Marks : " + this.marks + ", Division : " + this.div;
	}
}
