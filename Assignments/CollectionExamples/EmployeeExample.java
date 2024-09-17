package CollectionExamples;

import java.util.*;

class Employee{
	int empid;
	double empSalary;
	String empName,empLocation;
	
	public Employee(int empid, double empSalary, String empName, String empLocation) {
		super();
		this.empid = empid;
		this.empSalary = empSalary;
		this.empName = empName;
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "Employee ID : " + empid + "\nName : " + empName+ "\nSalary : " + empSalary  + "\nLocation : "+ empLocation;
	}
	
	
}
class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1,Employee o2) {
		if(o1.empid == o2.empid) {
			return 0;
		}
		else if(o1.empid > o2.empid) {
			return 1;
		}
		else {
			return -1;
		}
	}	
}
class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}
}



class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1,Employee o2) {
		if(o1.empSalary == o2.empSalary) {
			return 0;
		}
		else if(o1.empSalary > o2.empSalary) {
			return -1;
		}
		else {
			return 1;
		}
	}	
}
class SortByLocation implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empLocation.compareTo(o2.empLocation);
	}
}


public class EmployeeExample {	
	
	public static void sortMethod(List<Employee> list) {
		
		int choice=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHow do you Want to sort Employees");
		do {
			try {
				System.out.println("\n---------Sort Menu---------");
				System.out.println("1)By ID");
				System.out.println("2)By Name");
				System.out.println("3)By Salary");
				System.out.println("4)By Location");
				System.out.println("5)Main Menu");
				System.out.println("Enter your Chioce");
				choice=sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case 1:Collections.sort(list,new SortById());
							System.out.println("Sorted by ID");
							for(Employee e:list) {
								System.out.println("--------------||---------------");
								System.out.println(e);
							}
							System.out.println("--------------||---------------");
							break;
							
					case 2:Collections.sort(list,new SortByName());
						System.out.println("Sorted by Name");
							for(Employee e:list) {
								System.out.println("--------------||---------------");
								System.out.println(e);
							}
							System.out.println("--------------||---------------");
							break;
							
					case 3:Collections.sort(list,new SortBySalary());
							System.out.println("Sorting by Salary");
							System.out.println("--------------||---------------");
							for(Employee e:list) {
								System.out.println(e);
							}
							System.out.println("--------------||---------------");
							break;
							
					case 4:Collections.sort(list,new SortByLocation());
							System.out.println("Sorting by Location");
							for(Employee e:list) {
								System.out.println("--------------||---------------");
								System.out.println(e);
							}
							System.out.println("--------------||---------------");
							break;
			
					default:System.out.println("Invalid Input or May Returned to Main Menu");	
				}
			}
		
			catch(InputMismatchException e) {
				System.out.println("Wrong Input");
			}
			
		}while(choice!=5);
	}

	public static void searchMethod(List<Employee> list) {
		
		int empId,choice=0;
		double empSalary;
		String empName,empLocation;
		boolean found=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHow you want to search Employee");
		do {
			try {
				System.out.println("---------Sort Menu---------");
				System.out.println("1)By ID");
				System.out.println("2)By Name");
				System.out.println("3)By Salary");
				System.out.println("4)By Location");
				System.out.println("5)Main Menu");
				System.out.println("Enter your Chioce");
				choice=sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case 1:System.out.println("Enter Employee Id");
							empId=sc.nextInt();
							for(Employee e:list) {
								if(e.empid==empId) {
									found=true;
									System.out.println("Employee Found");
									System.out.println(e);
								}
							}
							if(found==false) {
								System.out.println("Employee doesnot Exists");
							}
							break;
					case 2:System.out.println("Enter Employee Name");
							sc.nextLine();
							empName=sc.nextLine();
							for(Employee e:list) {
								if(e.empName.toLowerCase().equals(empName.toLowerCase())) {
									found=true;
									System.out.println("Employee Found");
									System.out.println(e);
								}
							}
							if(found==false) {
								System.out.println("Employee doesnot Exists");
							}
							break;
					case 3:System.out.println("Enter Employee Salary");
							empSalary=sc.nextDouble();
							for(Employee e:list) {
								if(e.empSalary==empSalary) {
									found=true;
									System.out.println("Employee Found");
									System.out.println(e);
								}
							}
							if(found==false) {
								System.out.println("Employee doesnot Exists");
							}
							break;
					case 4:System.out.println("Enter Employee Location");
							empLocation=sc.nextLine();
							for(Employee e:list) {
								if(e.empLocation.toLowerCase().equals(empLocation.toLowerCase())) {
									found=true;
									System.out.println("Employee Found");
									System.out.println(e);
								}
							}
							if(found==false) {
								System.out.println("Employee doesnot Exists");
							}
							break;
						
					default:System.out.println("Invalid Input or May Returned to Main Menu");		
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Wrong Input");
			}
		}while(choice!=5);
	}
	
	public static void main(String[] args) {
		
			int choice=0;
			int empId;
			double empSalary;
			String empName,empLocation;
			
			Scanner sc = new Scanner(System.in);
			List<Employee> list = new ArrayList<Employee>();
			do {
				try {
						System.out.println("\n------------Main Menu-------------");
						System.out.println("1)Add More Employees");
						System.out.println("2)Display All");
						System.out.println("3)Sort Employee");
						System.out.println("4)Search Employee");
						System.out.println("5)Exit");
						System.out.println("Enter your choice");
						choice=sc.nextInt();
						sc.nextLine();
						
						
						switch(choice){
							case 1:try{
										System.out.println("\nEnter Data of Employee");
										System.out.println("Enter Employee Id:- ");
										empId = sc.nextInt();
										sc.nextLine();
										System.out.println("Enter Employee Name:- ");
										empName = sc.nextLine();
										System.out.println("Enter Employee Location:- ");
										empLocation = sc.nextLine();
										System.out.println("Enter Employee Salary:- ");
										empSalary = sc.nextDouble();
										list.add(new Employee(empId, empSalary, empName, empLocation));
									}
									catch(Exception e){
										System.out.println("Wrong Input");
										sc.next();
									}
									break;
									
							case 2:System.out.println("\nDisplaying All Records");
									ListIterator<Employee> itr = list.listIterator();
									while(itr.hasNext()) {
										System.out.println(itr.next());
									}
									break;
									
							case 3:sortMethod(list);
									break;
									
							case 4:searchMethod(list);
									break;
								
							default:System.out.println("Invalid Input or Exited");
						}
					}
					catch(Exception e) {
						break;
					}
			}while(choice!=5);
			sc.close();
		}
	}