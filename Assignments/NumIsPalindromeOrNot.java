/*Java program to check number is Palindrome or not */
/* Palindrome means the number remains same when reversed (e.g:-121)*/


import java.util.*;

public class NumIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check wheteher it is Palindrome or Not");
		num=sc.nextInt();
		
		int temp=num,checkedValue=0;
		while(temp!=0) {
			
			checkedValue=checkedValue*10;		
			checkedValue += temp%10;
			temp=temp/10;
		}
		if(checkedValue==num) {
			System.out.println("Given number "+num+" is a Palindrome Number");
			
		}
		else {
			System.out.println("Given number "+num+" is not a Palindrome Number");
		}
	}
}
