package CollectionExamples;

import java.util.Comparator;

import java.util.*;

class Student{
	public int rollNo,age;
	public String studName;
	public double percent;
	
	public Student(int rollNo, int age, String studName, double percent) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.studName = studName;
		this.percent = percent;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student RollNo : " + rollNo + ", Age : " + age + ", Name : " + studName + ", Percentage : " + percent;
	}
	
	
}

class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.age ==s2.age) {
			return 0;
		}
		else if(s1.age >s2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}	
}

class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.studName.compareTo(s2.studName);
	}	
}

class PerComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.percent ==s2.percent) {
			return 0;
		}
		else if(s1.percent >s2.percent) {
			return -1;
		}
		else {
			return 1;
		}
	}	
}

class RolNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.rollNo ==s2.rollNo) {
			return 0;
		}
		else if(s1.rollNo >s2.rollNo) {
			return 1;
		}
		else {
			return -1;
		}
	}	
}



public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(43, 20, "Mayur", 35));
		list.add(new Student(26, 31, "Arjun", 88));
		list.add(new Student(23, 19, "Trupti",75));
		list.add(new Student(10, 22, "Farhan", 59));
		list.add(new Student(45, 21, "Omkar", 99));
		list.add(new Student(66, 21, "Apurva", 63));
		System.out.println("All records");
		ListIterator<Student> li = list.listIterator();
		while(li.hasNext()) {
				System.out.println(li.next());
		}
		
		System.out.println("---------------------------");
		System.out.println("Sorting using Roll No: ");
		Collections.sort(list,new RolNoComparator());
		for(Student st:list) {
			System.out.println(st.toString());
		}
		
		System.out.println("---------------------------");
		System.out.println("Sorting using Age: ");
		Collections.sort(list,new AgeComparator());
		for(Student st:list) {
			System.out.println(st.toString());
		}
		
		System.out.println("---------------------------");
		System.out.println("Sorting using Name: ");
		Collections.sort(list,new NameComparator());
		for(Student st:list) {
			System.out.println(st.toString());
		}
		
		System.out.println("---------------------------");
		System.out.println("Sorting using Percentage: ");
		Collections.sort(list,new PerComparator());
		for(Student st:list) {
			System.out.println(st.toString());
		}

	}
}
