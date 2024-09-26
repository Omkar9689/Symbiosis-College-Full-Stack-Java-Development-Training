
import java.util.*;

public class FunWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Enter first Number :- ");
		num1=sc.nextInt();
		System.out.println("Enter Second Number :- ");
		num2=sc.nextInt();
		if(num1<num2) {
			System.out.println("SUm of "+num1+" & "+num2+" is :- "+(num1+num2));
			
		}
		else {
			System.out.println("Diference between "+num1+" & "+num2+" is :- "+(num1-num2));
		}
	}
}
