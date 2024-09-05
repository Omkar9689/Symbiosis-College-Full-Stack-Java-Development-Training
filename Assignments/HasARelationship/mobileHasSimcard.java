package HasARelationship;

class simCard{
	private String cardNo;
	public simCard() {
		
		System.out.println("Simcard obj Created");
		cardNo="New Sim Constructed";
	}
	@Override
	public String toString() {
		return "simCard cardNo : " + cardNo;
	}	
}

class mobile{
	
	private simCard mysim = new simCard();			//use of Aggregation
	private String mobileName = "Samsung";
	private int modelNo = 45;
	@Override
	public String toString() {
		return mysim + ", mobileName=" + mobileName + ", modelNo=" + modelNo;
	}
	
}
public class mobileHasSimcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile mymobile = new mobile();
		System.out.println(mymobile);
	

	}

}
