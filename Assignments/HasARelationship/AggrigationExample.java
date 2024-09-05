package HasARelationship;

class calculations{
	int calArea(int l,int b) {
		return l*b;
	}
}

class rectangle{
	
	/*(Has-A-Relationship "Aggregation") is used 
	 * i.e object of one class is created in another class*/
	
	calculations cal;				
	String name;
	int area(int l, int b) {
		cal = new calculations();
		int rectArea=cal.calArea(l, b);
		return rectArea;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class AggrigationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area;
		rectangle rec = new rectangle();
		rec.setName("My Rectangle");
		area=rec.area(10, 20);
		
		System.out.println("Name is "+rec.getName()+" ans its area is "+area);

	}

}
