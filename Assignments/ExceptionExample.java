
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=0;
		try {
				int c=a/b;
				
				System.out.println(" C : "+c);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Divide by 0 Error");
			//System.out.println(e.getMessage());
		}
		
		int d=a+b;
		System.out.println(" D : "+d);
		
		int e=a-b;
		System.out.println(" E : "+e);
	}
}
