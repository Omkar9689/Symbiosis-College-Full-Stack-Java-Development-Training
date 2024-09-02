/*Java program to find the given character is Alphabet,Digit or Symbol */

import java.util.*;

public class charIsDigitOrSymborOrAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character (only one character i.e first charcter is read)");
		ch=sc.next().charAt(0);
	
		if(ch == 'a'||ch == 'b'||ch == 'c'||ch == 'd'||ch == 'e'||ch == 'f'||ch == 'g'||ch == 'h'||ch == 'i'||ch =='j'||ch == 'k'||ch == 'l'||ch == 'm'||ch == 'n'||ch == 'o'||ch == 'p'||ch == 'q'||ch == 'r'||ch == 's'||ch == 't'||ch == 'u'||ch == 'v'||ch == 'w'||ch == 'x'||ch == 'y'||ch == 'z'||ch == 'A'||ch == 'B'||ch == 'C'||ch == 'D'||ch == 'E'||ch == 'F'||ch == 'G'||ch == 'H'||ch == 'I'||ch == 'J'||ch == 'K'||ch == 'L'||ch == 'M'||ch == 'N'||ch == 'O'||ch == 'P'||ch == 'Q'||ch == 'R'||ch == 'S'||ch == 'T'||ch == 'U'||ch == 'V'||ch == 'W'||ch == 'X'||ch == 'Y'||ch == 'Z'){
			System.out.println("Character is Alphabet");
		}
		
		else if(ch == '0'||ch == '1'||ch == '2'||ch == '3'||ch == '4'||ch == '5'||ch == '6'||ch == '7'||ch == '8'||ch == '9') {
			System.out.println("Character is a Digit");
		
		}
		
		else {
			System.out.println("Character is a Symbol");
		}
		
	}

}
