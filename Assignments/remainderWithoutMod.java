/* Java program to find remainder without using mod operator */

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
		System.out.println(num1 + " % " + num2 + " = "+ (num1 % num2));				//answer using mod operator
		
		System.out.println("Answer without using Modulous Operator");
		System.out.println( num1 - ( ( num1 / num2 )  * num2) );					//answer without using mod operator
		
		/* Steps for the logic
		1)Find quotient by using "/" divide operator i.e quotient = num1/num2
		2)Subtract the product of quotient and divisor i.e "quotient * num2"
			from the dividend i.e ans = num1 - (quotient*num2)
		*/
	}

}
