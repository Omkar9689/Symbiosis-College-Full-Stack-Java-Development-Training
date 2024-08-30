/* Java program to demonstrate 2D Array of String */
import java.util.*;

public class stateCityUsing2DArray {

	public static void main(String[] args) {
		
		String str[][]= new String[2][2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			for(int j=0;j< 2;j++) {
				if(j==0)
				{
					System.out.println("Enter State");
					str[i][j]=sc.nextLine();
				}
				else {
					System.out.println("Enter Name of City Belong to State "+str[i][0]);
					str[i][j]=sc.nextLine();
				}
			}
		}
		
		System.out.println("------------------------");
		for(int i = 0; i < 2 ; i++) {
			for(int j=0;j< 2;j++) {
					System.out.print(str[i][j]+" \t");
			}
			System.out.println();
		}
	}
}
