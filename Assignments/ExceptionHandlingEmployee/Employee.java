package ExceptionHandlingEmployee;

import java.util.*;

class invalidAgeException extends Exception{
	public invalidAgeException(String a) {
		super(a);
	}
}
class invalidCityException extends Exception{
	public invalidCityException(String a) {
		super(a);
	}
}

public class Employee {
	private String eName,eAddr,eLocation;
	private int age;
	
	public Employee() {}
	
	public Employee(String eName, String eAddr,String eLocation, int age) {
		this.eName = eName;
		this.eAddr = eAddr;
		this.eLocation=eLocation;
		this.age = age;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public String geteLocation() {
		return eLocation;
	}

	public void seteLocation(String eLocation) {
		this.eLocation = eLocation;
	}

	@Override
	public String toString() {
		return "Employee Name : " + eName + ", Address : " + eAddr + ", Age : " + age+", Loacation : "+eLocation;
	}
	
	public static void main(String[] args) {
		
			String eName,eAddr,eLocation,eloc;
			String city[]=new String[] {"nashik","pune","mumbai","banglore"};
			int age;
			Scanner sc = new Scanner(System.in);
			
			Employee emp = new Employee();			
			System.out.println("Enter Employee Data");
			System.out.println("Enter Name");
			eName=sc.nextLine();
			emp.seteName(eName);
			System.out.println("Enter Address");
			eAddr=sc.nextLine();
			emp.seteAddr(eAddr);
			System.out.println("Enter Age");
			try {
					age=sc.nextInt();
					if(age<18 || age>28) {
						throw new invalidAgeException("Invaid Age");
					}
					else {
						emp.setAge(age);
					}
			}
			catch(invalidAgeException e1) {
				System.out.println(e1.getMessage());
			}
			catch(InputMismatchException x1) {
				System.out.println("Wrong Input");
			}
			catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
			System.out.println("Enter Location");
			try {
				sc.nextLine();
				eLocation=sc.nextLine();
				eloc=eLocation.toLowerCase();
				for(String ct:city) {
					if(eloc.equals(ct)) {
						emp.seteLocation(eLocation);;
						eloc="";
					}
				}
				if(eloc!="") {
					throw new invalidCityException("Invalid City");
				}	
			}
			catch(invalidCityException a1) {
				System.out.println(a1.getMessage());
			}
			catch(InputMismatchException x2) {
				System.out.println("Wrong Input");
			}
			catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
			System.out.println("-----------------------------------");
			System.out.println(emp);
	}
}
