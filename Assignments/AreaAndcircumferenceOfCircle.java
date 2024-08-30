/* Java program to find Area and Circumference of Circle */

import java.util.Scanner;

public class AreaAndcircumferenceOfCircle {
	
		static final double pi=3.14;
	
		static void circumference(float radius){
			
			System.out.println("Circumference of circle having Radius r = "+radius+"cm is "+(2*pi*radius)+"cm"); 
		}
		
		static void area(float radius) {
			
			System.out.println("Area of Circle having Radius r ="+radius+"cm is "+(pi*radius*radius)+"sqcm");
		}
		public static void main(String args[]) {
			float radius;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Radius of Circle in cm(centimeters)");
			radius = sc.nextFloat();
			
			area(radius);
			circumference(radius);
			
			
		}

}
