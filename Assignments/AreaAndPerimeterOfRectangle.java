/*Java program to find Area and Perimeter of  Rectangle*/

import java.util.*;

public class AreaAndPerimeterOfRectangle {
	
	static void perimeter(int length,int breadth){
		
		System.out.println("Perimeter of Rectangle with Lenght :- "+length+"cm and Breadth :- "+breadth+"cm is "+(2*(length+breadth))+"cm");
	}
	
	static void area(int length,int breadth) {
		
		System.out.println("Area of Rectangle with Lenght :- "+length+" and Breadth :- "+breadth+" is "+(length*breadth)+"sq cm");
	}
	public static void main(String args[]) {
		int length,breadth;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length of Regtangle");
		length=sc.nextInt();
		System.out.println("Enter Breadth of Regtangle");
		breadth=sc.nextInt();
		
		area(length,breadth);
		perimeter(length,breadth);
		
		
	}

}
