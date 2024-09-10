package ExceptionHandling;
import javax.naming.PartialResultException;

public class ExceptionExample2 {
	
	public static void method1(){};
	public static void method2() {
		try {
				int a=0;
				int b=10/0;
				System.out.println("B : "+b);
				
				int c[] = {1,2,3,4,5};
				
				c[15]=15;
				
				System.out.println("C[15] : "+c[1]);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2.getMessage());
		}
		catch(Exception e3) {
			System.out.println(e3.getMessage());
		}
		finally {
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();
	

			
	}

}
