package football;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		football fb = new football("Rugby",5,66);
		
		footballOfPlayer p1 = new footballOfPlayer("Omkar",fb);

		System.out.println("Player "+p1.getNameOfPlayer()+" playes with football type "+p1.fb.getType()+" size "+p1.fb.getSize()+" and weight "+p1.fb.getWeight());
	}

}
