package InterfaceExamplePerson;

public class Person {

	private String perName,city;
	
	public Person() {}


	public Person(String perName, String city) {
		
		this.perName = perName;
		this.city = city;	
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	


	@Override
	public String toString() {
		return "Person Name : " + perName + ", City : " + city+", ";
	}
}
