/*Java program to fond AscII value of character */
import java.util.*;

public class AsciiOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character : -");
		ch=sc.next().charAt(0);
		
		int asciiValue = (int) ch;

		System.out.println("The ASCII value of "+ch+" is "+asciiValue);
	}

}
