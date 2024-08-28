import java.util.*;
public class vowelConsonant {

	public static void main(String[] args) {
		char alphabet1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Alphabet is Vowel or consonant using if-else ladder");
		System.out.println("Enter Alphabet:- \n");
		alphabet1 = sc.next().charAt(0);
		System.out.println("You entered the Alphabet "+alphabet1+"\n");
		
		if(alphabet1 == 'a' || alphabet1 == 'A') {
			
			System.out.println("Alphabet is a Vowel");
		}
		else if(alphabet1 == 'e' || alphabet1 == 'E') {
			
			
			System.out.println("Alphabet is a Vowel");
		}
		else if(alphabet1 == 'i' || alphabet1 == 'I') {
			
			System.out.println("Alphabet is a Vowel");
		}
		else if(alphabet1 == 'o' || alphabet1 == 'O') {
			
			System.out.println("Alphabet is a Vowel");
		}
		else if(alphabet1 == 'u' || alphabet1 == 'U') {
			
			System.out.println("Alphabet is a Vowel");
		}
		else {
			
			System.out.println("Consonant \n");
		}
		
		char alphabet2;
		System.out.println("\n Alphabet is Vowel or consonant using swith-case ladder ");
		System.out.println("Enter Alphabet:- ");
		alphabet2=sc.next().charAt(0);
		System.out.println("You entered the Alphabet "+alphabet2+"\n");
		
		switch(alphabet2){
		
		case 'a':System.out.println("Vowel");
			break;
			
		case 'e':System.out.println("Vowel");
			break;
		
		case 'i':System.out.println("Vowel");
			break;
		
		case 'o':System.out.println("Vowel");
			break;
		
		case 'u':System.out.println("Vowel");
			break;
		
		case 'A':System.out.println("Vowel");
			break;
		
		case 'E':System.out.println("Vowel");
			break;
		
		case 'I':System.out.println("Vowel");
			break;
		
		case 'O':System.out.println("Vowel");
			break;
		
		case 'U':System.out.println("Vowel");
			break;
		
		default:System.out.println("Not a Vowel");
		}

	}

}
