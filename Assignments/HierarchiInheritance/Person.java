package HierarchiInheritance;

public class Person {
	
	private String name,city;
	
	public Person(){
		System.out.println("Default Constructor (Person)");
		this.name="Omkar";
		this.city="Nashik";
	}

	public Person(String name, String city) {
		//super();
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Name : "+this.name+" and City : "+this.city;
	}
}


