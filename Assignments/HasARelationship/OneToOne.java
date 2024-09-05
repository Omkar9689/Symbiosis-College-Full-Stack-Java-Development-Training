package HasARelationship;


class person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
class passport{
	private int pid;
	
	person p = new person();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}
public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Two objects can use each others properties or functionalities 
		 * and can also remain independent (Has - A - Relationship ("Composition")
		 */
		
		person p1 = new person();
		p1.setName("Omkar");
		
		person p2 = new person();
		p2.setName("Mayur");
		
		passport pp1 = new passport();
		pp1.setPid(1234);
		
		passport pp2 = new passport();
		pp2.setPid(2104);
		
		
		System.out.println(p1.getName()+" has a US Passport whose Passport-Id is "+pp1.getPid());
		System.out.println(p2.getName()+" has a Pakisthan Passport whose Passport-Id is "+pp2.getPid());


	}

}
