import java.util.*;

public class simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float timeInYears,rateOfInterest;
		double principleAmt,simpleInterest;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount");
		principleAmt = sc.nextDouble();
		System.out.println("Enter Rate of Interest");
		rateOfInterest = sc.nextFloat();
		System.out.println("Enter Time (in years)");
		timeInYears = sc.nextFloat();
		
		simpleInterest = (principleAmt*rateOfInterest*timeInYears)/100;
		
		System.out.println("The Simple Interest On Principle Amount "+principleAmt+" for period of "+timeInYears+" Years Is "+simpleInterest);
	}

}
