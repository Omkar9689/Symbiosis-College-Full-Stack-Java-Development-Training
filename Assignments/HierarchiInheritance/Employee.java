package HierarchiInheritance;

public class Employee extends Person {

	private int empId;
	private String dept;
	
	public Employee() {
		
		System.out.println("Default Constructor (Employee)");
		empId = 121;
		dept = "Developer";
	}
	
	
	public Employee(int empId, String dept) {
		this.empId = empId;
		this.dept = dept;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String toString() {
		return "Employee Id : "+this.empId + ", Department : "+this.dept;
	}	
}
