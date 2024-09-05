package BiDirectionalRelationship;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userName u1 = new userName();
		u1.setname("Omkar");
		
		address ad1 = new address();
		ad1.setCity("Nashik");
		ad1.setState("Maharashtra");
		ad1.setZip(422213);
		
		System.out.println("Name :- "+u1.getname()+" and Address :- City - "+ad1.getCity()+", State - "+ad1.getState()+", Zip Code - "+ad1.getZip());

	}

}
