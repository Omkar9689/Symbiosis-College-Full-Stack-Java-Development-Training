
import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc = new Scanner(System.in);
		
		int angleA,angleB,angleC;
		
		System.out.println("Enter Angle A");
		angleA=sc.nextInt();
		
		System.out.println("Enter Angle B");
		angleB=sc.nextInt();
		
		System.out.println("Enter Angle C");
		angleC=sc.nextInt();
		
		if((angleA+angleB+angleC)==180) {
			System.out.println("Sum of all 3 angles is 180 degrees");
		}
		else {
			System.out.println("Sum of all 3 angles is not 180 degrees");
		}
		
	}

}
