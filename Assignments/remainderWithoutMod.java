import java.util.*;

public class remainderWithoutMod {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		System.out.println("Answer using Modulous Operator");
		System.out.println(num1+ " % " +num2+ " = "+num1%num2);
		
		System.out.println("Answer without using Modulous Operator");
		System.out.println(num1-((num1/num2)*num2));
	}

}
